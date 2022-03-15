package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2ecdbfd8-34f7-4f8d-82be-4d17e2a63802
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1555, profileId = 101598)
public class Costofrawmaterialsandconsumables1FA775_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Cost_of_raw_materials_and_consumables1FA775","Cost_of_raw_materials_and_consumables1FA775 - Default Profile"})
    @TestModellerPath(guid = "706ef6b0-d03d-4ec3-b372-03b411f64b5a")
    public void GoToUrlAssertUrl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Costofrawmaterialsandconsumables1FA775_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Cost_of_raw_materials_and_consumables1FA775 _Cost_of_raw_materials_and_consumables1FA775 = new pages.Cost_of_raw_materials_and_consumables1FA775(driver);
    TestModellerLogger.SetLastNodeGuid("e4e149a6-088f-4f4c-bf47-2421d0f438a7");
    _Cost_of_raw_materials_and_consumables1FA775.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b3de8a80-d178-4b03-9a01-f7cb2dc40fcb");
    _Cost_of_raw_materials_and_consumables1FA775.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _Cost_of_raw_materials_and_consumables1FA775.Enter_Username("admin");
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _Cost_of_raw_materials_and_consumables1FA775.Enter_Password("admin1@1");
    
    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _Cost_of_raw_materials_and_consumables1FA775.Click_Login_Button();
    
    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _Cost_of_raw_materials_and_consumables1FA775.Enter_AgentName("nidhi2");
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _Cost_of_raw_materials_and_consumables1FA775.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _Cost_of_raw_materials_and_consumables1FA775.Click__Nakul_();

    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _Cost_of_raw_materials_and_consumables1FA775.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _Cost_of_raw_materials_and_consumables1FA775.Enter_SearchCompany("NidhiEnt2");

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _Cost_of_raw_materials_and_consumables1FA775.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _Cost_of_raw_materials_and_consumables1FA775.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _Cost_of_raw_materials_and_consumables1FA775.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _Cost_of_raw_materials_and_consumables1FA775.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _Cost_of_raw_materials_and_consumables1FA775.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _Cost_of_raw_materials_and_consumables1FA775.Click_Full_Accounts();
    
    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
    _Cost_of_raw_materials_and_consumables1FA775.Click_Income_Statement_Page();
    

    TestModellerLogger.SetLastNodeGuid("d5e93db0-ae89-4110-bac1-ac8f6901fb58");
    _Cost_of_raw_materials_and_consumables1FA775.Click_Cost_of_raw_material_and_consumables();
    

    }

}
