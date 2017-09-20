package newFeatures;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptRun {

	public static void main(String[] args) {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		String script = " var name='Cat Dog';name;";

	try{
	Object result = engine.eval(script);
	System.out.println(result);
	} catch (ScriptException e) {
		e.printStackTrace();
	}
}
}
