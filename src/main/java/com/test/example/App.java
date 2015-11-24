package com.test.example;

import javax.script.*;
import org.renjin.sexp.*;
import com.test.example.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ScriptException
    {
        System.out.println( "Starting the process");
        
        //Create the renjin scripting interface
    	ScriptEngineManager manager = new ScriptEngineManager();
    	
        // create a Renjin engine:
        ScriptEngine engine = manager.getEngineByName("Renjin");
        // check if the engine has loaded correctly:
        if(engine == null) {
            throw new RuntimeException("Renjin Script Engine not found on the classpath.");
        }
        
        // load the rda serialized file
        engine.eval("setwd(\"/Users/robertarnold/Projects/java-realtime-model/src/main/r/simple-lm-model\")");
        engine.eval("source(\"evaluate.r\")");
        
        //Sample workflow inside of java code
        /*
         * Create a new object of tuples (key/value pair)
         * Pass that object to an renjin interface
         * 		score the transaction and send data back
         * Cast resulting data into a score object
         */
        
        //New data
        IncomingData newData = new IncomingData(1, 3, 2);
        
        //Evaluate the data
        Vector prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        System.out.println(prediction.getElementAsDouble(0));
        
        //Some timings
        long startTime = System.currentTimeMillis();
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        prediction = (Vector)engine.eval("evaluate(" + newData.y + ")");
        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        System.out.println(duration);
    }
}
