try {
	        // Create Engine, initialize random number generator:
	        Engine engine = createEngine();
	        engine.setTimeUnit(SECOND);
	        
	        // Fixed seed (reproducible simulation runs)
	        engine.getDefaultRandomGenerator().setSeed(1);
	        
	        // Selection mode for simultaneous events:
			engine.setSimultaneousEventsSelectionMode( Engine.EVENT_SELECTION_LIFO );
			engine.setStartTime( 0.0 );
	        engine.setStartDate( toDate( 2021, APRIL, 22, 5, 0, 0 ) );
	        
	        // Set stop time:
	        engine.setStopTime(72000);
	 		
	        // Set optimization variables
	        Main dummyMain = new Main();
	        dummyMain.setParametersToDefaultValues();
	        int nOfDecisionVars = dummyMain.numAutos.length;
	        COptQuestVariable[] decVars = new COptQuestVariable[nOfDecisionVars];

			for ( int i = 0; i < nOfDecisionVars; i++ ) {	       
	        	final COptQuestIntegerVariable  dv = new COptQuestIntegerVariable();
	       		dv.SetLowerBound(5);
		        dv.SetUpperBound(60);
		        dv.SetName("Decision var: " + i);
		        decVars[i] = dv;
		    }

	        // Create constraints
	 		int totalNumAutos = 1200;
	 		COptQuestLEConstraint constraint_1 = new COptQuestLEConstraint(totalNumAutos);
	 		for ( int i = 0; i < nOfDecisionVars; i++ )
	 			constraint_1.AddVariable(decVars[i], 1);
	 			
			// Create objective
	        final COptQuestObjective obj = new COptQuestUserControlledObjective();
	        obj.SetMinimize(); 
	 		
	 		// write headers of log file
	 		dummyMain.writeOutput("Itr" + "\t" + "d[0]" + "\t" + "d[1]" + "\t" + "d[2]" + "\t" + "d[3]" + "\t" + "d[4]" + "\t" + "d[5]" + "\t" + "d[6]" + "\t" + "d[7]" + "\t" + 
	 							  "d[8]" + "\t" + "d[9]" + "\t" + "d[10]" + "\t" + "d[11]" + "\t" + "d[12]" + "\t" + "d[13]" + "\t" + "d[14]" + "\t" + "d[15]" + "\t" + "d[16]" + "\t" + 
	 							  "d[17]" + "\t" + "d[18]" + "\t" + "d[19]" + "\t" + "d[20]" + "\t" + "d[21]" + "\t" + "d[22]" + "\t" + "d[23]" + "\t" + "d[24]" + "\t" + "d[25]" + "\t" + 
	 							  "d[26]" + "\t" + "d[27]" + "\t" + "d[28]" + "\t" + "d[29]" + "\t" + "d[30]" + "\t" + "d[31]" + "\t" + "d[32]" + "\t" + "d[33]" + "\t" + "d[34]" + "\t" + 
	 							  "d[35]" + "\t" + "d[36]" + "\t" + "d[37]" + "\t" + "d[38]" + "\t" + "d[39]" + "\t" + "Current Obj" + "\t" + "Best Obj" + "\n");
	 		
	        // Create optimization engine
	        final COptQuestOptimization opt = ExperimentOptimization.createOptimization(engine, new OptimizationCallback() {
	 
	                                @Override
	                                public void evaluate(COptQuestOptimization optimization,
	                                                COptQuestSolution solution, Engine engine) {
	                                                
	                                                // Create new root object:
	                                                Main root = new Main(engine, null, null);
	                                                
	                                                // Setup parameters of root object here
	                                                root.setParametersToDefaultValues();
	                                                for ( int i = 0; i < nOfDecisionVars; i++ )
		                                                  root.numAutos[i] = (int) solution.GetVariableValue(decVars[i]);
	                                                
	                                                // set the seed to fixed value
	                                                engine.getDefaultRandomGenerator().setSeed(1);
	                                                
	                                                // Prepare Engine for simulation:
	                                                engine.start(root);
	                                                
	                                                // Start simulation in fast mode:
	                                                engine.runFast();
	                                                //engine.run();
	                                                
	                                                // Process results of simulation here
	                                                solution.SetObjectiveValue(obj, root.lostDemands());
	                                                root.getStationWiseStatistics();
	                                                
	                                                // Destroy the model:
	                                                engine.stop();
	                                }
	                                
	                                // Trace each iteration (optional)
								    @Override
								    public void monitorStatus(COptQuestOptimization optimization,
								            COptQuestSolution solution, Engine engine) {
								        try {
								            
                                            trace(String.format(" %3d :" , solution.GetIteration()));
                                            for ( int i = 0; i < nOfDecisionVars; i++ ) {
                                            	trace(String.format("%6.2f :", solution.GetVariableValue(decVars[i])));
                                            }
                   							
                   							trace(String.format("%8.2f  -- %8.2f", solution.GetObjectiveValue(), 
                   								optimization.GetBestSolution() != null ? optimization.GetBestSolution().GetObjectiveValue(obj) : Double.NaN));
                   							
                                            // write into output file
								            dummyMain.writeOutput(Double.toString(solution.GetIteration()) + "\t");
								            for ( int i = 0; i < nOfDecisionVars; i++ ) {	  
								            	 dummyMain.writeOutput(Double.toString(solution.GetVariableValue(decVars[i])) + "\t");
								            }
								            dummyMain.writeOutput(Double.toString(solution.GetObjectiveValue()) + "\t" + Double.toString(optimization.GetBestSolution() != null ? optimization.GetBestSolution().GetObjectiveValue(
                                                                                                obj) : Double.NaN) + "\n");

								        } catch (COptQuestException e) {
								            traceln(e.Description());
								        }
								        
								    }
	                        });
	      
	        // Setup optimization engine
	        for ( int i = 0; i < nOfDecisionVars; i++ )
					  opt.AddVariable( decVars[i]); 	        
		    		
	        opt.AddObjective(obj);
	        opt.AddConstraint(constraint_1);
	        
	        // Set the maximum solver runtime
	        opt.SetMaximumTime(86400);
	        
	        // Add suggested solution (initial solution)
	        COptQuestSolution suggestedSolution = opt.CreateSolution();
	        for (int i = 0; i < nOfDecisionVars; i++) {
					  suggestedSolution.SetVariableValue(decVars[i], 30.0); 	
			}		          
	        opt.AddSuggestedSolution(suggestedSolution);
	 
	        // Perform optimization
	        opt.Optimize();
	 
	        // Output results
	        COptQuestSolution bestSolution = opt.GetBestSolution();
            double[] bestDecValues = new double[nOfDecisionVars];

            for ( int i = 0; i < nOfDecisionVars; i++ )
            	bestDecValues[i] = bestSolution.GetVariableValue( decVars[i] );
			
			// output logs
	        traceln("\nBest values: " + Arrays.toString( bestDecValues ));
	        traceln("Best Obj: Number of lost demands: " +  format(bestSolution.GetObjectiveValue(obj)));
			traceln("Solution feasibility: " + format(bestSolution.IsFeasible()));
			traceln("Best iteration: " + bestSolution.GetIteration());
	        
	
} catch (COptQuestException e) {
	        traceln(e.Description());
}	        	

   