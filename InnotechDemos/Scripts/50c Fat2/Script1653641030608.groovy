import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.ui.view.WindowsDefaults as WindowsDefaults
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Windows.startApplicationWithTitle('C:\\Program Files (x86)\\Sage\\Sage 50c\\Sage.50c.CGCO.exe', '')

Windows.delay(5)

Windows.switchToWindowTitle('Sage 50c Empresas', FailureHandling.STOP_ON_FAILURE)

Windows.click(findWindowsObject('Object Repository/50c Fat/LoginWindow'), FailureHandling.OPTIONAL)

Windows.click(findWindowsObject('Object Repository/50c Fat/PasswordInput'), FailureHandling.STOP_ON_FAILURE)

Windows.setText(findWindowsObject('Object Repository/50c Fat/PasswordInput'), '1234', FailureHandling.STOP_ON_FAILURE)

Windows.click(findWindowsObject('Object Repository/50c Fat/LoginButton'), FailureHandling.STOP_ON_FAILURE)

Windows.delay(10)

Windows.switchToWindowTitle('Sage 50c 2022.01.001 - Professional - [999999990 - Empresa Demonstrativa, Lda.]', FailureHandling.STOP_ON_FAILURE)

Windows.click(findWindowsObject('Object Repository/50c Fat/FaturasButton'), FailureHandling.STOP_ON_FAILURE)

Windows.click(findWindowsObject('Object Repository/50c Fat/OptionListFactura'), FailureHandling.STOP_ON_FAILURE)

Windows.click(findWindowsObject('Object Repository/50c Fat/OptionListFactura'), FailureHandling.STOP_ON_FAILURE)

//for (i = 1; i < 5; i++) {
//    Windows.sendKeys(findWindowsObject('Object Repository/50c Fat/OptionListFactura'), 'F', FailureHandling.STOP_ON_FAILURE)
//}
Windows.sendKeys(findWindowsObject('Object Repository/50c Fat/OptionListFactura'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

Windows.click(findWindowsObject('Object Repository/50c Fat/NumberSelect1'), FailureHandling.STOP_ON_FAILURE)

Windows.click(findWindowsObject('Object Repository/50c Fat/NumberSelect1'), FailureHandling.STOP_ON_FAILURE)

Windows.sendKeys(findWindowsObject('Object Repository/50c Fat/NumberSelect1'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

Windows.sendKeys(findWindowsObject('Object Repository/50c Fat/NumerSelect2'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

Windows.sendKeys(findWindowsObject('Object Repository/50c Fat/DateSelect'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

Windows.sendKeys(findWindowsObject('Object Repository/50c Fat/HoursSelect'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

Windows.click(findWindowsObject('Object Repository/50c Fat/CustomersSearch'), FailureHandling.STOP_ON_FAILURE)

Windows.doubleClick(findWindowsObject('Object Repository/50c Fat/CARNERIROeSOUSA'), FailureHandling.STOP_ON_FAILURE)

Windows.rightClick(findWindowsObject('Object Repository/50c Fat/Referencia'), FailureHandling.STOP_ON_FAILURE)

Windows.sendKeys(findWindowsObject('Object Repository/50c Fat/RightClickMenu-VisualizarArtigos'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)


//Windows.sendKeys(findWindowsObject('Object Repository/50c Fat/Referencia'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE) 
//Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)

