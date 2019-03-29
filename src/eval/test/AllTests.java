package eval.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//import eval.question.Quest8_MinMax;

@RunWith(Suite.class)
@SuiteClasses({ Quest1_ageTest.class,Quest2_MultipleTest.class, Quest3_AdditionTest.class,
		Quest4_ControleSaisieNomTest.class, Quest5_IntervalleTest.class,
		Quest6_PrenomLongTriTest.class,Quest7_DeTest.class})
public class AllTests {

}
