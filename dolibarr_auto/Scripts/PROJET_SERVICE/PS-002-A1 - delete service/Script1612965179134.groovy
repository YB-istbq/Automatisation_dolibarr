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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-A1/Page_Accueil - Dolibarr 1300/span_Services'), 1, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PS-002-A1/Page_Accueil - Dolibarr 1300/span_Services'), FailureHandling.OPTIONAL)

WebUI.navigateToUrl('http://localhost:3000/dolibarr/product/index.php?mainmenu=products&leftmenu=', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-A1/Page_Produits et Services/a_Liste'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PS-002-A1/Page_Produits et Services/a_Liste'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-A1/Page_Produits et Services/span_ref_fas fa-concierge-bell paddingright_c95ed5'), 
    1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PS-002-A1/Page_Produits et Services/span_ref_fas fa-concierge-bell paddingright_c95ed5'), 
    FailureHandling.OPTIONAL)

WebUI.waitForElementVisible(findTestObject('PS-002-A1/Page_Service lib - Fiche/span_Supprimer'), 5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PS-002-A1/Page_Service lib - Fiche/span_Supprimer'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PS-002-A1/Page_Service lib - Fiche/span_Supprimer un produitservice'), 1, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PS-002-A1/Page_Service lib - Fiche/button_Oui'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PS-002-A1/Page_Service lib - Fiche/button_Oui'), FailureHandling.OPTIONAL)

WebUI.navigateToUrl('http://localhost:3000/dolibarr/product/list.php?type=1&delprod=ref', FailureHandling.OPTIONAL)

