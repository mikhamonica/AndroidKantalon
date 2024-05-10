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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.todoist')

//WebUI.waitForElementVisible(findTestObject('TODOISNEW/android.view.View'), 100)

Mobile.tap(findTestObject('Object Repository/TODOISNEW/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/TODOISNEW/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/TODOISNEW/android.view.View (1)'), 0)

Mobile.setText(findTestObject('Object Repository/TODOISNEW/android.widget.EditText - e.g. Portuguese class every weekday'), 
    'Testing Task', 0)

Mobile.tap(findTestObject('Object Repository/TODOISNEW/android.widget.EditText - Description'), 0)

Mobile.setText(findTestObject('Object Repository/TODOISNEW/android.widget.EditText - Description (1)'), 'testing for create new task', 
    0)

Mobile.tap(findTestObject('Object Repository/TODOISNEW/android.widget.TextView - Due date'), 0)

Mobile.tap(findTestObject('Object Repository/TODOISNEW/android.view.View (2)'), 0)

Mobile.scrollToText('SAVE')

Mobile.tap(findTestObject('Object Repository/TODOISNEW/android.widget.Button - SAVE'), 0)

Mobile.tap(findTestObject('Object Repository/TODOISNEW/android.widget.ImageView'), 0)

Mobile.pressBack()

Mobile.closeApplication()

