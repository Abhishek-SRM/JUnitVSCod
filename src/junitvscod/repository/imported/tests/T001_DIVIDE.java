package junitvscod.repository.imported.tests;

import java.util.Collection;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.skyscreamer.jsonassert.JSONAssert;
import iunit.utilities.testcase.execution.TestCaseExecutionHelper;
import iunit.utilities.xml.XMLUtils;
import com.arcadsoftware.iunit.rdi.core.utils.IUnitJSONComparator;
import java.util.List;
import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class T001_DIVIDE {

	static String inputXMLFilePath = "testcases/junitvscod.repository.imported.tests/T001_DIVIDE.xml";
	String input;
	String expectedResult;
	String compareJson;
	String[] operator = new String[] { "*EQ", "*GE", "*GT", "*LE", "*LT", "*NE" };
	boolean isFailureAssertion = false;
	boolean isErrorAssertion = false;
	boolean isPass = false;

	public T001_DIVIDE(String input, String expectedResult, String compareJson) {
		this.input = input;
		this.expectedResult = expectedResult;
		this.compareJson = compareJson;
	}

	@Parameters
	public static Collection<String[]> testData() {
		return XMLUtils.getTestData("resources/junitvscod.repository.imported.tests/T001_DIVIDE");
	}
}