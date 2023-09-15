package junitvscod.pkg1.pkg2;

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
    public class ADDNUM_SRVPGM_SUM_1 {

        static String inputXMLFilePath = "testcases/junitvscod.pkg1.pkg2/$(symbol-namespace) <Default Package>.xml";
        String input;
        String expectedResult;
        String compareJson;
        String[] operator = new String[] { "*EQ", "*GE", "*GT", "*LE", "*LT", "*NE" };
        boolean isFailureAssertion = false;
        boolean isErrorAssertion = false;
        boolean isPass = false;
    
        public ADDNUM_SRVPGM_SUM_1(String input, String expectedResult, String compareJson) {
            this.input = input;
            this.expectedResult = expectedResult;
            this.compareJson = compareJson;
        }
    
        @Parameters
        public static Collection<String[]> testData() {
            return XMLUtils.getTestData("resources/junitvscod.pkg1.pkg2/$(symbol-namespace) <Default Package>");
        }
    }