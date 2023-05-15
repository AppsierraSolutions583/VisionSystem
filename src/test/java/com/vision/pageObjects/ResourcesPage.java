package com.vision.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class ResourcesPage extends GeneralFunctions {
	public WebDriver driver;
	public static Logger log = Logger.getLogger(ResourcesPage.class);

	private String currentpass = "Emmanuelk";
	private String newpass = "emmanuelk";
	private String confnewpass = "emmanuelk";

	// resources
	@FindBy(xpath = "//a[@href='#/resources']/span[text()='Resources']")
	private WebElement resources;

	// organization chart
	@FindBy(xpath = "//a[@href='#/orgchart']/span[text()='Organization Chart']")
	private WebElement organizationChart;

	// user DIZON
	@FindBy(xpath = "//div[contains(text(),' DIZON, RONNIE C. ')]")
	private WebElement userDizon;

	// set password
	@FindBy(xpath = "//button[@id='Set Password']/span[2]")
	private WebElement setPassword;

	// current password
	@FindBy(xpath = "//input[@id='CurrentPassword']")
	private WebElement currentPassword;

	// new password
	@FindBy(xpath = "//input[@id='NewPassword']")
	private WebElement NewPassword;

	// confirm new password
	@FindBy(xpath = "//input[@id='NewPassword2']")
	private WebElement confirmNewPassword;

	// dismiss button
	@FindBy(xpath = "//button[@id='Dismiss']")
	private WebElement dismiss;

	// ok button
	@FindBy(xpath = "//button[@id='OK']")
	private WebElement oK;

	// error message
	@FindBy(xpath = "//span[contains(text(),'Please enter your correct password.')]")
	private WebElement errorMsg;

	// new version dismiss message
	@FindBy(xpath = "//span[contains(text(),'Dismiss')]")
	private WebElement newVersionMsgDismiss;

	// collection ---> event tab
	// new button
	@FindBy(xpath = "//span[text()='New']")
	private WebElement newbtn;

	// type
	@FindBy(xpath = "//label[text()='Select value']")
	private WebElement type;

	// title
	@FindBy(xpath = "//input[@id='Title']")
	private WebElement title;

	// description
	@FindBy(xpath = "//input[@id='Description']")
	private WebElement description;

	// all day
	@FindBy(xpath = "//p-inputswitch[@id='AllDay']/div")
	private WebElement allday;

	// start date
	@FindBy(xpath = "")
	private WebElement start;

	// end date
	@FindBy(xpath = "")
	private WebElement end;

	// ok button
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement ok;

	// dismiss button
	@FindBy(xpath = "//span[text()='Dismiss']")
	private WebElement dismiss1;

	// search input
	@FindBy(xpath = "//input[@class='ng-star-inserted']")
	private WebElement search;

	// export button
	@FindBy(xpath = "//span[text()='Export']")
	private WebElement exportbtn;

	// collection --->shift tab

	// select shift
	@FindBy(xpath = "//a[@id='ui-tabpanel-67-label']")
	private WebElement shifts;

	// select
	@FindBy(xpath = "//span[text()='Select']")
	private WebElement select;

	// shift name
	@FindBy(xpath = "//label[text()='Select value']")
	private WebElement shiftName;

	// firstday
	@FindBy(xpath = "")
	private WebElement firstDay;

	// lastday
	@FindBy(xpath = "")
	private WebElement lastDay;

	// collection --->skill tab

	// select shift
	@FindBy(xpath = "//a[@id='ui-tabpanel-68-label']/span[2]")
	private WebElement skills;

	// select1
	@FindBy(xpath = "//span[text()='Select']")
	private WebElement select1;

	// skills name
	@FindBy(xpath = "//label[text()='Select value']")
	private WebElement skillsName;

	// input search
	@FindBy(xpath = "//input[@class='ui-dropdown-filter ui-inputtext ui-widget ui-state-default ui-corner-all']")
	private WebElement inputSearch;

	// level
	@FindBy(xpath = "//p-rating[@id='Level']/div/a[4]")
	private WebElement level;

	// collection --->timekeeping tab

	// timekeeping
	@FindBy(xpath = "//a[@href='#/timekeepingMenu']/span[text()='Timekeeping']")
	private WebElement timekeeping;

	// add button
	@FindBy(xpath = "//span[text()='Add']")
	private WebElement add;

	// work order
	@FindBy(xpath = "//input[@id='MemberName']")
	private WebElement workOrder;

	// production state
	@FindBy(xpath = "//*[@id=\"ProductionState\"]/div/label/text()")
	private WebElement productionState;

	// start time
	@FindBy(xpath = "")
	private WebElement startTime;

	// end time
	@FindBy(xpath = "")
	private WebElement endTime;

	// notes
	@FindBy(xpath = "//textarea[@id=\"Notes\"]")
	private WebElement notes;

	// Breaktimes
	@FindBy(xpath = "//div[contains(text(),'Breaktimes')]")
	private WebElement breaktimes;

	// name
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement name;

	@FindBy(xpath = "//input[@id='Description']")
	private WebElement description1;

	// abc radio button
	@FindBy(xpath = "(//span[@class='ui-radiobutton-icon ui-clickable'])[1]")
	private WebElement selectBreaktime;

	@FindBy(xpath = "//span[text()='Delete']")
	private WebElement delete;

	@FindBy(xpath = "//span[text()='Yes']")
	private WebElement yes;

	@FindBy(xpath = "//span[text()='Edit']")
	private WebElement edit;

	// capabilities

	@FindBy(xpath = "//div[contains(text(),'Capabilities')]")
	private WebElement Capabilities;

	// add new capabilities
	@FindBy(xpath = "//span[contains(text(),'New')]")
	private WebElement CapabilitiesNewBtn;

	@FindBy(xpath = "//*[@id=\"Name\"]")
	private WebElement CapabilitiesName;

	@FindBy(xpath = "//*[@id=\"Description\"]")
	private WebElement CapabilitiesDescription;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement CapabilitiesOkBtn;

	@FindBy(xpath = "//*[@id=\"Dismiss\"]/span[2]")
	private WebElement CapabilitiesDismissBtn;

	// edit capabilities
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement SelectCapabilitiesradiobtn;

	@FindBy(xpath = "//*[@id=\"Edit\"]/span[2]")
	private WebElement EditCapabilitiesbtn;

	// delete capabilities
	@FindBy(xpath = "//*[@id=\"Delete\"]/span[2]")
	private WebElement DeleteCapabilitiesbtn;

	// capabilities filter matching
	@FindBy(xpath = "//span[normalize-space()='Name, Description, State']")
	private WebElement CapabilitiesFilterDropdown;

	@FindBy(xpath = "//li[@aria-label='Name']")
	private WebElement CapabilitiesFilterNameDeselect;

	@FindBy(xpath = "//li[@aria-label='Description']")
	private WebElement CapabilitiesFilterDescriptionDeselect;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[1]/div/div[1]/p-multiselect/div/div[3]/span")
	private WebElement CapabilitiesFilterOk;

	// capabilities export

	@FindBy(xpath = "//*[@id=\"exportButton\"]/span[2]")
	private WebElement CapabilitiesExportBtn;

	// capabilities sort
	@FindBy(xpath = "//*[@id=\"Name-column\"]")
	private WebElement CapabilitiesNameSort;

	@FindBy(xpath = "//*[@id=\"Description-column\"]")
	private WebElement CapabilitiesDescriptionSort;

	@FindBy(xpath = "//*[@id=\"State-column\"]")
	private WebElement CapabilitiesStateSort;

	// companies

	@FindBy(xpath = "//div[contains(text(),'Companies')]")
	private WebElement companies;

	// add companies
	@FindBy(xpath = "//*[@id=\"New\"]/span[2]")
	private WebElement AddNewCompanies;

	@FindBy(xpath = "//*[@id=\"Name\"]")
	private WebElement CompanyName;

	@FindBy(xpath = "//input[@id='LongName']")
	private WebElement CompanyLongName;

	@FindBy(xpath = "//input[@id='ABN']")
	private WebElement CompanyAbn;

	@FindBy(xpath = "//*[@id=\"CompanyType\"]/div/label")
	private WebElement CompanyType;

	@FindBy(xpath = "//*[@id=\"CompanyType\"]/div/div[3]/div[2]/ul/p-dropdownitem[3]/li/span")
	private WebElement CompanyTypeValue;

	@FindBy(xpath = "//*[@id=\"Currency\"]/div/label")
	private WebElement CompanyCurrency;

	@FindBy(xpath = "//span[contains(text(),'USD')]")
	private WebElement CompanyCurrencyValue;

	@FindBy(xpath = "//*[@id=\"Notes\"]")
	private WebElement CompanyNotes;

	@FindBy(xpath = "/html[1]/body[1]/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[7]/div[1]/webuilib-item-job-table-form[1]/form[1]/webuilib-item-table-form[1]/p-table[1]/div[1]/div[3]/div[1]/button[1]/span[2]")
	private WebElement CompanyPhoneNumberAddBtn;

	@FindBy(xpath = "/html[1]/body[1]/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[7]/div[1]/webuilib-item-job-table-form[1]/form[1]/webuilib-item-table-form[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/p-celleditor[1]/div[1]/div[1]")
	private WebElement CompanyWorkType;

	@FindBy(xpath = "//*[@id=\"Type18\"]/div/div[2]/span")
	private WebElement CompanyWorkTypeDropdown;

	@FindBy(xpath = "/html/body/div[2]/div[2]/ul/p-dropdownitem[2]/li/span")
	private WebElement CompanyWorkTypeDropdownValue;

	@FindBy(xpath = "//*[@id=\"Number1\"]")
	private WebElement CompanyWorkPhoneNumber;

	@FindBy(xpath = "//*[@id=\"Number18\"]")
	private WebElement CompanyPhoneNumber;

	@FindBy(xpath = "/html[1]/body[1]/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[8]/div[1]/webuilib-item-job-table-form[1]/form[1]/webuilib-item-table-form[1]/p-table[1]/div[1]/div[3]/div[1]/button[1]/span[2]")
	private WebElement CompanyEmailAddBtn;

	@FindBy(xpath = "//*[@id=\"Type11\"]/div/div[2]/span")
	private WebElement CompanyWorkEmailDropdown;

	@FindBy(xpath = "//*[@id=\"Address1\"]")
	private WebElement CompanyWorkEmailDropdownValue;

	@FindBy(xpath = "/html[1]/body[1]/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[8]/div[1]/webuilib-item-job-table-form[1]/form[1]/webuilib-item-table-form[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/p-celleditor[1]/div[1]/div[1]")
	private WebElement CompanyWorkEmailType;

	@FindBy(xpath = "//*[@id=\"Address1\"]")
	private WebElement CompanyWorkEmail;

	@FindBy(xpath = "//*[@id=\"Address11\"]")
	private WebElement CompanyEmail;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement CompanyOkBtn;

	@FindBy(xpath = "//*[@id=\"Dismiss\"]/span[2]")
	private WebElement CompanyDismissBtn;

	// edit comapnaies
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement SelectCompaniesradiobtn;

	@FindBy(xpath = "//*[@id=\"Edit\"]/span[2]")
	private WebElement EditCompaniesbtn;

	// delete companies
	@FindBy(xpath = "//*[@id=\"Delete\"]/span[2]")
	private WebElement DeleteCompaniesbtn;

	// company filter
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[1]/div/div[1]/p-multiselect/div/div[2]/span")
	private WebElement CompanyFilter;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[1]/div/div[1]/p-multiselect/div/div[4]/div[2]/ul/p-multiselectitem[1]/li")
	private WebElement CompanyFilterName;

	@FindBy(xpath = "//span[normalize-space()='Long Name']")
	private WebElement CompanyFilterLongName;

	@FindBy(xpath = "//li[@aria-label='ABN']//span[@class='ng-star-inserted'][normalize-space()='ABN']")
	private WebElement CompanyFilterABN;

	@FindBy(xpath = "//span[normalize-space()='Company Type']")
	private WebElement CompanyFilterCompanyType;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[1]/div/div[1]/p-multiselect/div/div[3]/span")
	private WebElement CompanyFilterOk;

	// company export
	@FindBy(xpath = "//*[@id=\"exportButton\"]/span[2]")
	private WebElement CompaniesExportBtn;

	// companies----> collection----->Address

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/webuilib-uuid-link/span/a")
	private WebElement CompaniesSelect;

	@FindBy(xpath = "//*[@id=\"ui-tabpanel-149-label\"]/span[2]")
	private WebElement CompaniesAddressTab;

	@FindBy(xpath = "(//webuilib-item-toolbar[@class='cristaliseItemToolbar']/div/p-toolbar/div/div/button/span)[2]")
	private WebElement CompaniesCollectionAddressNewBtn;

	@FindBy(xpath = "//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down']")
	private WebElement CompaniesCollectionPurposeDropdown;

	@FindBy(xpath = "//*[@id=\"Purpose\"]/div/div[3]/div[2]/ul/p-dropdownitem[2]/li")
	private WebElement CompaniesCollectionPurposeDropdownValue;

	@FindBy(xpath = "//input[@id='Description']")
	private WebElement companyDescription;

	@FindBy(xpath = "//input[@id='AddressLine1']")
	private WebElement CompaniesCollectionAddressLine1;

	@FindBy(xpath = "//input[@id='AddressLine2']")
	private WebElement CompaniesCollectionAddressLine2;

	@FindBy(xpath = "//input[@id='AddressLine3']")
	private WebElement CompaniesCollectionAddressLine3;

	@FindBy(xpath = "//input[@id='AddressLine4']")
	private WebElement CompaniesCollectionAddressLine4;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement CompaniesCollectionOkBtn;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement CompaniesCollectionDismissBtn;

	// contact person
	@FindBy(xpath = "//div[contains(text(),'Contact Persons')]")
	private WebElement ContactsPerson;

	// add new contact person
	@FindBy(xpath = "//*[@id=\"New\"]/span[2]")
	private WebElement AddContactPersonNewBtn;

	@FindBy(xpath = "//*[@id=\"Name\"]")
	private WebElement ContactPersonName;

	@FindBy(xpath = "//*[@id=\"Title\"]/div/div[2]/span")
	private WebElement ContactPersonTitleDropdown;

	@FindBy(xpath = "//*[@id=\"Title\"]/div/div[3]/div[2]/ul/p-dropdownitem[5]/li")
	private WebElement ContactPersonTitleDropdownValue;

	@FindBy(xpath = "//*[@id=\"FullName\"]")
	private WebElement ContactPersonFullName;

	@FindBy(xpath = "//*[@id=\"JobTitle\"]/div/div[2]/span")
	private WebElement ContactPersonJobTitleDropdown;

	@FindBy(xpath = "//*[@id=\"JobTitle\"]/div/div[3]/div[2]/ul/p-dropdownitem[5]/li/span")
	private WebElement ContactPersonJobTitleDropdownValue;

	@FindBy(xpath = "(//span[contains(text(),'Add')])[1]")
	private WebElement ContactPersonPhoneNumberAddBtn;

	@FindBy(xpath = "//*[@id=\"Type1\"]/p-celleditor/div/div")
	private WebElement ContactPersonPhoneNumberType;

	@FindBy(xpath = "//*[@id=\"Type19\"]/div/div[2]/span")
	private WebElement ContactPersonPhoneNumberTypeDropdown;

	@FindBy(xpath = "/html/body/div[2]/div[2]/ul/p-dropdownitem[3]/li/span")
	private WebElement ContactPersonPhoneNumberTypeDropdownValue;

	@FindBy(xpath = "//*[@id=\"Number1\"]")
	private WebElement ContactPersonPhoneNumber;

	@FindBy(xpath = "//*[@id=\"Number19\"]")
	private WebElement ContactPersonPhoneNumberValue;

	@FindBy(xpath = "(//span[contains(text(),'Add')])[2]")
	private WebElement ContactPersonEmailAddBtn;

	@FindBy(xpath = "//*[@id=\"Type1\"]/p-celleditor/div/div")
	private WebElement ContactPersonEmailType;

	@FindBy(xpath = "//*[@id=\"Type177\"]/div/div[2]/span")
	private WebElement ContactPersonEmailTypeDropdown;

	@FindBy(xpath = "/html/body/div[2]/div[2]/ul/p-dropdownitem[3]/li/span")
	private WebElement ContactPersonEmailTypeDropdownValue;

	@FindBy(xpath = "//*[@id=\"Address1\"]")
	private WebElement ContactPersonEmail;

	@FindBy(xpath = "//*[@id=\"Address177\"]")
	private WebElement ContactPersonEmailValue;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement ContactPersonOkBtn;

	@FindBy(xpath = "//*[@id=\"Dismiss\"]/span[2]")
	private WebElement ContactPersonDismissBtn;

	// edit contact person
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement SelectCotactPersonradiobtn;

	@FindBy(xpath = "//*[@id=\"Edit\"]/span[2]")
	private WebElement EditContactPersonbtn;

	// delete contact person
	@FindBy(xpath = "//*[@id=\"Delete\"]/span[2]")
	private WebElement DeleteContactPersonbtn;

	// contact person filter

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[1]/div/div[1]/p-multiselect/div/div[3]/span")
	private WebElement ContactPersonFilterDropdown;

	@FindBy(xpath = "//span[normalize-space()='Username']")
	private WebElement ContactPersonFilterName;

	@FindBy(xpath = "//li[@aria-label='Title']")
	private WebElement ContactPersonFilterTitle;

	@FindBy(xpath = "//span[normalize-space()='Full Name']")
	private WebElement ContactPersonFilterFullName;

	@FindBy(xpath = "//span[normalize-space()='Job Title']")
	private WebElement ContactPersonFilterJobTitle;

	// contact person export
	@FindBy(xpath = "//*[@id=\"exportButton\"]/span[2]")
	private WebElement ContactPersonExportBtn;

	// departments menu
	@FindBy(xpath = "//div[contains(text(),'Departments')]")
	private WebElement Department;

	// add new department
	@FindBy(xpath = "//span[contains(text(),'New')]")
	private WebElement AddNewDepartment;

	@FindBy(xpath = "//*[@id=\"Name\"]")
	private WebElement DepartmentName;

	@FindBy(xpath = "//*[@id=\"Description\"]")
	private WebElement DepartmentDescription;

	@FindBy(xpath = "//*[@id=\"Parent\"]/div/label")
	private WebElement SelectDepartmentParent;

	@FindBy(xpath = "//*[@id=\"Parent\"]/div/div[3]/div[2]/ul/p-dropdownitem[29]/li/span")
	private WebElement DepartmentParent;

	@FindBy(xpath = "//span[contains(text(),'OK')]")
	private WebElement DepartmentOk;

	// EditDepartment
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement SelectDepartmentradiobtn;

	@FindBy(xpath = "//*[@id=\"Edit\"]/span[2]")
	private WebElement EditDepartmentbtn;

	// DeleteDepartment
	@FindBy(xpath = "//span[normalize-space()='Delete']")
	private WebElement DeleteDepartmentbtn;

	@FindBy(xpath = "//span[normalize-space()='Yes']")
	private WebElement YesDeleteDepartmentbtn;

	// department filter

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[1]/div/div[1]/p-multiselect/div/div[3]/span")
	private WebElement DepartmentFilterDropdown;

	@FindBy(xpath = "//li[@aria-label='Name']")
	private WebElement DepartmentFilterName;

	@FindBy(xpath = "//span[normalize-space()='Description']")
	private WebElement DepartmentFilterDescription;

	// department export
	@FindBy(xpath = "(//div[@class='ui-radiobutton ui-widget'])[1]")
	private WebElement selectDepartment;

	@FindBy(xpath = "//*[@id=\"exportButton\"]/span[2]")
	private WebElement DepartmentExportBtn;

	// employees menu
	@FindBy(xpath = "//div[contains(text(),'Employees')]")
	private WebElement Employees;

	@FindBy(xpath = "//span[contains(text(),'New')]")
	private WebElement EmployeesNewBtn;

	@FindBy(xpath = "//input[@id='Name']")
	private WebElement EmployeesUserName;

	@FindBy(xpath = "//input[@id='EmployeeNumber']")
	private WebElement EmployeesNumber;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[3]/div[1]/dynamic-primeng-dropdown[1]/div[1]/p-dropdown[1]/div[1]/div[2]/span[1]")
	private WebElement EmployeesTitleDropdown;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[3]/div[1]/dynamic-primeng-dropdown[1]/div[1]/p-dropdown[1]/div[1]/div[3]/div[2]/ul[1]/p-dropdownitem[5]/li[1]")
	private WebElement EmployeesTitleDropdownValue;

	@FindBy(xpath = "//input[@id='FullName']")
	private WebElement EmployeesFullName;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[5]/div[1]/dynamic-primeng-dropdown[1]/div[1]/p-dropdown[1]/div[1]/div[2]/span[1]")
	private WebElement EmployeesDepartmentDropdown;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[5]/div[1]/dynamic-primeng-dropdown[1]/div[1]/p-dropdown[1]/div[1]/div[3]/div[2]/ul[1]/p-dropdownitem[6]/li[1]")
	private WebElement EmployeesDepartmentDropdownValue;

	@FindBy(xpath = "//input[@id='JobTitle']")
	private WebElement EmployeesJobTitle;

	@FindBy(xpath = "//*[@id=\"TaxID\"]")
	private WebElement EmployeesTaxId;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[8]/div[1]/dynamic-primeng-calendar[1]/div[1]/p-calendar[1]/span[1]/button[1]/span[1]")
	private WebElement EmployeesDateOfHire;

	@FindBy(xpath = "//tbody/tr[2]/td[2]/a[1]")
	private WebElement EmployeesDateOfHireValue;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[9]/div[1]/dynamic-primeng-input-switch[1]/div[1]/p-inputswitch[1]/div[1]/span[1]")
	private WebElement EmployeesManager;

	@FindBy(xpath = "//span[contains(text(),'OK')]")
	private WebElement EmployeesOkBtn;

	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	private WebElement EmployeesEditBtn;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement SelectEmployeeradioBtn;

	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	private WebElement EmployeesDeleteBtn;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement YesDeleteEmployees;


	// set password
	@FindBy(xpath = "//*[@id=\"Set Password\"]/span[2]")
	private WebElement EmployeesSetPasswordBtn;


	@FindBy(xpath = "//*[@id=\"CurrentPassword\"]")
	private WebElement EmployeeEnterYOURPassword;

	@FindBy(xpath = "//*[@id=\"NewPassword\"]")
	private WebElement EmployeeNewPasswordForUser;

	@FindBy(xpath = "//*[@id=\"NewPassword2\"]")
	private WebElement EmployeeConfirmNewPasswordForUser;

	@FindBy(xpath = "//*[@id=\"Dismiss\"]/span[2]")
	private WebElement EmployeeDismissBtn;

	// add collection event
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/webuilib-uuid-link/span/a")
	private WebElement EmployeeUserName;

	@FindBy(xpath = "//webuilib-item-toolbar[@class='cristaliseItemToolbar']//span[@class='ui-button-text ui-clickable'][normalize-space()='New']")
	private WebElement EmployeeCollectionEventAddbtn;

	@FindBy(xpath = "//*[@id=\"Kind\"]/div/label")
	private WebElement EmployeeScheduleEntryType;

	@FindBy(xpath = "//*[@id=\"Kind\"]/div/div[3]/div[2]/ul/p-dropdownitem[3]/li/span")
	private WebElement EmployeeScheduleEntryTypeValue;

	@FindBy(xpath = "//input[@id='Title']")
	private WebElement EmployeeScheduleEntryTitle;

	@FindBy(xpath = "//*[@id=\"Description\"]")
	private WebElement EmployeeScheduleEntryDescription;

	@FindBy(xpath = "//*[@id=\"AllDay\"]/div/span")
	private WebElement EmployeeScheduleEntryAllday;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/webuilib-item-details[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/div[1]/div[2]/p-panel[1]/div[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/webuilib-item-collection[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[5]/div[1]/dynamic-primeng-calendar[1]/div[1]/p-calendar[1]/span[1]/button[1]/span[1]")
	private WebElement EmployeeScheduleEntryStart;

	@FindBy(xpath = "//tbody/tr[2]/td[3]/a[1]")
	private WebElement EmployeeScheduleEntryStartValue;

	@FindBy(xpath = "//label[contains(text(),'Type *')]")
	private WebElement EmployeeScheduleEntrytype;



	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/webuilib-item-details[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/div[1]/div[3]/p-panel[1]/div[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/webuilib-item-collection[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[5]/div[1]/dynamic-primeng-calendar[1]/div[1]/p-calendar[1]/span[1]/button[1]/span[1]")
	private WebElement EmployeeStart;

	@FindBy(xpath = "//tbody/tr[3]/td[4]/a[1]")
	private WebElement EmployeesStartValue;


	@FindBy(xpath = "//label[contains(text(),'Start Time *')]")
	private WebElement StartTimeClick;

	@FindBy(xpath = "//button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c33-119 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']//span[@class='ui-button-icon-left ui-clickable fa fa-calendar']")
	private WebElement EmployeesEnd;

	@FindBy(xpath = "//a[contains(text(),'19')]")
	private WebElement EmployeesEndValue;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement EmployeesScheduleEntryOkBtn;

	@FindBy(xpath = "//*[@id=\"Dismiss\"]/span[2]")
	private WebElement EmployeeScheduleEntryDismissBtn;

	@FindBy(xpath = "//input[@class='ng-star-inserted']")
	private WebElement EmployeeSearch;

	@FindBy(xpath = "//th[@id='UserName-column']")
	private WebElement EmployeeUsernameColumn;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/webuilib-uuid-link")
	private WebElement EmployeeSelect;


	@FindBy(xpath = "//li[contains(@class,'ng-star-inserted ui-state-default ui-corner-top tab-active ui-tabview-selected ui-state-active')]")
	private WebElement EmployeeHistoryTab;

	// collection shift

	@FindBy(xpath = "//a[@id='ui-tabpanel-6-label']")
	private WebElement EmployeeCollectionShiftTab;

	@FindBy(xpath = "//span[normalize-space()='Select']")
	private WebElement EmployeeCollectionShiftSelectBtn;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/webuilib-item-details[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/div[1]/div[3]/p-panel[1]/div[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/webuilib-item-collection[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-dropdown[1]/div[1]/p-dropdown[1]/div[1]/div[2]/span[1]")
	private WebElement EmployeeCollectionShiftName;

	@FindBy(xpath = "//span[contains(text(),'CIRCUIT - 2:00PM TO 10:00PM')]")
	private WebElement EmployeeCollectionShiftNameValue;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/webuilib-item-details[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/div[1]/div[3]/p-panel[1]/div[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/webuilib-item-collection[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[2]/div[1]/dynamic-primeng-calendar[1]/div[1]/p-calendar[1]/span[1]/button[1]/span[1]")
	private WebElement EmployeeCollectionShiftFirstDay;

	@FindBy(xpath = "//tbody/tr[3]/td[3]/a[1]")
	private WebElement EmployeeCollectionShiftFirstDayValue;

	@FindBy(xpath = "//*[@id=\"ThruDate\"]/span/div/div[1]/div[2]/table/tbody/tr[5]/td[2]/a")
	private WebElement EmployeeCollectionShiftLastDay;

	@FindBy(xpath = "//*[@id=\"ThruDate\"]/span/div/div[2]/div/div[1]/button/span")
	private WebElement EmployeeCollectionShiftLastDayValue;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement EmployeesShiftOkBtn;

	@FindBy(xpath = "//label[contains(text(),'First Day *')]")
	private WebElement FirstDayClick;



	@FindBy(xpath = "//*[@id=\"Dismiss\"]/span[2]")
	private WebElement EmployeeShiftDismissBtn;

	// collection skills

	@FindBy(xpath = "//*[@id=\"ui-panel-7-content\"]/div/p-tabview/div/ul/li[2]")
	private WebElement EmployeeCollectionSkillsTab;

	@FindBy(xpath = "//div[@id='ui-tabpanel-87']//span[@class='ui-button-text ui-clickable'][normalize-space()='Select']]")
	private WebElement EmployeeCollectionSkillsSelectBtn;

	@FindBy(xpath = "//*[@id=\"MemberName\"]/div/label")
	private WebElement EmployeeCollectionSkillsName;

	@FindBy(xpath = "//*[@id=\"MemberName\"]/div/div[3]/div[2]/ul/p-dropdownitem[2]/li/span")
	private WebElement EmployeeCollectionSkillsNameValue;

	@FindBy(xpath = "//*[@id=\"Level\"]/div/a[6]/span")
	private WebElement EmployeesSkillsLevel;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement EmployeesSkillsOkBtn;

	@FindBy(xpath = "//*[@id=\"Dismiss\"]/span[2]")
	private WebElement EmployeeSkillsDismissBtn;

	// collection timekeeping

	@FindBy(xpath = "//*[@id=\"ui-tabpanel-8-label\"]/span[2]")
	private WebElement EmployeeCollectionTimekeepingTab;

	@FindBy(xpath = "//*[@id=\"Add\"]/span[2]")
	private WebElement EmployeeCollectionTimekeepingAddBtn;

	@FindBy(xpath = "//*[@id=\"MemberName\"]")
	private WebElement EmployeeCollectionTimekeepingWorkOrder;

	@FindBy(xpath = "//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down']")
	private WebElement EmployeeCollectionTimekeepingProductionState;

	@FindBy(xpath = "//li[@aria-label='BUILD PICKLIST']")
	private WebElement EmployeeCollectionTimekeepingProductionStateValue;

	@FindBy(xpath = "//*[@id=\"Notes\"]")
	private WebElement EmployeeCollectionTimekeepingNotes;

	@FindBy(xpath = "//tbody/tr[2]/td[3]/a[1]")
	private WebElement EmployeeCollectionTimekeepingStartDateValue;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/webuilib-item-details[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/div[1]/div[3]/p-panel[1]/div[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[4]/div[1]/webuilib-item-collection[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[4]/div[1]/dynamic-primeng-calendar[1]/div[1]/p-calendar[1]/span[1]/button[1]/span[1]")
	private WebElement EmployeeCollectionTimekeepingStartDate;


	@FindBy(xpath = "//label[contains(text(),'Work Order *')]")
	private WebElement EmployeeCollectionTimekeepingWorkOrderLabel;


	@FindBy(xpath = "//*[@id=\"Notes\"]")
	private WebElement EmployeeCollectionTimekeepingEndDate;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement EmployeesTimekeepingOkBtn;

	@FindBy(xpath = "//*[@id=\"Dismiss\"]/span[2]")
	private WebElement EmployeeTimeKeepingDismissBtn;

	// Machine menu
	@FindBy(xpath = "//div[contains(text(),'Machines')]")
	private WebElement Machines;

	// add new machine
	@FindBy(xpath = "//*[@id=\"New\"]/span[2]")
	private WebElement AddNewMachine;

	@FindBy(xpath = "//*[@id=\"Name\"]")
	private WebElement MachineName;

	@FindBy(xpath = "//*[@id=\"Model\"]")
	private WebElement MachineModel;

	@FindBy(xpath = "//*[@id=\"SerialNumber\"]")
	private WebElement MachineSerialNumber;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement MachineOk;

	// edit machine
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement SelectMachineradiobtn;

	@FindBy(xpath = "//*[@id=\"Edit\"]/span[2]")
	private WebElement Editmachinebtn;

	// delete machine
	@FindBy(xpath = "//*[@id=\"Delete\"]/span[2]")
	private WebElement DeleteMachinebtn;

	@FindBy(xpath = "//span[normalize-space()='Yes']")
	private WebElement yesDeleteMachine;

	// machine collection capabilities
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/webuilib-uuid-link/span/a")
	private WebElement MachineCollectionName;

	@FindBy(xpath = "//span[contains(text(),'Select')]")
	private WebElement MachineCollectionCapabilitiesSelectBtn;

	@FindBy(xpath = "//*[@id=\"MemberName\"]/div/label")
	private WebElement MachineCollectionCapabilitiesMemeberName;

	@FindBy(xpath = "//*[@id=\"MemberName\"]/div/div[3]/div[2]/ul/p-dropdownitem[3]/li/span")
	private WebElement MachineCollectionCapabilitiesMemeberNameValue;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement MachineCollectionCapabilitiesOkBtn;

	@FindBy(xpath = "//*[@id=\"Dismiss\"]/span[2]")
	private WebElement MachineCollectionCapabilitiesDismissBtn;

	// machine collection events

	@FindBy(xpath = "//span[normalize-space()='Events']")
	private WebElement machineCollectionEventTab;

	@FindBy(xpath = "//webuilib-item-toolbar[@class='cristaliseItemToolbar']//span[@class='ui-button-text ui-clickable'][normalize-space()='New']")
	private WebElement MachineCollectionEventNewBtn;

	// Machine Filter
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[1]/div/div[1]/p-multiselect/div/div[3]/span")
	private WebElement MachineFilterDropdown;

	@FindBy(xpath = "//li[@aria-label='Name']")
	private WebElement MachineFilterName;

	@FindBy(xpath = "//li[@aria-label='Model']")
	private WebElement MachineFilterModel;

	@FindBy(xpath = "//span[normalize-space()='Serial Number']")
	private WebElement MachineFilterSerialNumber;

	// Shift menu
	@FindBy(xpath = "//div[contains(text(),'Shifts')]")
	private WebElement Shifts;

	// add new shift
	@FindBy(xpath = "//span[contains(text(),'New')]")
	private WebElement AddNewShift;

	@FindBy(xpath = "//*[@id=\"Name\"]")
	private WebElement ShiftName;

	@FindBy(xpath = "//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-caret-down']")
	private WebElement ShiftDays;

	@FindBy(xpath = "//label[@for='ShiftDays']")
	private WebElement ShiftDays1;



	@FindBy(xpath = "//li[@aria-label='Monday']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")
	private WebElement ShiftMonday;

	@FindBy(xpath = "//*[@id=\"ShiftDays\"]/div/div[4]/div[2]/ul/p-multiselectitem[2]/li/span")
	private WebElement ShiftTuesday;

	@FindBy(xpath = "//*[@id=\"ShiftDays\"]/div/div[4]/div[2]/ul/p-multiselectitem[3]/li/span")
	private WebElement ShiftWednesday;

	@FindBy(xpath = "//*[@id=\"ShiftDays\"]/div/div[4]/div[2]/ul/p-multiselectitem[4]/li/span")
	private WebElement shifThursday;

	@FindBy(xpath = "//*[@id=\"ShiftDays\"]/div/div[4]/div[2]/ul/p-multiselectitem[5]/li/span")
	private WebElement ShiftFriday;

	@FindBy(xpath = "//*[@id=\"ShiftDays\"]/div/div[4]/div[2]/ul/p-multiselectitem[6]/li/span")
	private WebElement ShiftSaturday;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[3]/div[1]/dynamic-primeng-calendar[1]/div[1]/p-calendar[1]/span[1]/button[1]/span[1]")
	private WebElement FromHours;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[3]/div[1]/dynamic-primeng-calendar[1]/div[1]/p-calendar[1]/span[1]/div[1]/div[1]/div[3]/a[1]/span[1]")
	private WebElement FromHoursValues;


	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[4]/div[1]/dynamic-primeng-calendar[1]/div[1]/p-calendar[1]/span[1]/button[1]/span[1]")
	private WebElement ThruHours;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[4]/div[1]/dynamic-primeng-calendar[1]/div[1]/p-calendar[1]/span[1]/div[1]/div[1]/div[3]/a[1]/span[1]")
	private WebElement ThruHoursvalues;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement ShiftOk;

	// edit shift
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement SelectShiftradiobtn;

	@FindBy(xpath = "//*[@id=\"Edit\"]/span[2]")
	private WebElement EditShiftbtn;

	// delete shift
	@FindBy(xpath = "//*[@id=\"Delete\"]/span[2]")
	private WebElement DeleteShiftbtn;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/webuilib-item-toolbar/p-dialog[1]/div/div[3]/p-footer/div/button[1]/span[2]")
	private WebElement YesDeleteShiftbtn;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/webuilib-uuid-link/span/a")
	private WebElement ShiftNameRecord;


	// skills menu

	@FindBy(xpath = "//div[contains(text(),'Skills')]")
	private WebElement Skills;

	// add new skills
	@FindBy(xpath = "//span[contains(text(),'New')]")
	private WebElement AddNewSkills;

	@FindBy(xpath = "//*[@id=\"Name\"]")
	private WebElement SkillsName;

	@FindBy(xpath = "//*[@id=\"Description\"]")
	private WebElement SkillsDescription;

	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement SkillsOkBtn;

	@FindBy(xpath = "//*[@id=\"Dismiss\"]/span[2]")
	private WebElement SkillsDismissBtn;

	// edit skills

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement SelectSkillradiobtn;

	@FindBy(xpath = "//*[@id=\"Edit\"]/span[2]")
	private WebElement EditSkillbtn;

	// delete shift
	@FindBy(xpath = "//*[@id=\"Delete\"]/span[2]")
	private WebElement deleteSkillbtn;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement dissmissYes;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/webuilib-item-toolbar/p-dialog[1]/div/div[3]/p-footer/div/button[1]/span[2]")
	private WebElement YesDeleteSkilltbtn;

	@FindBy(xpath = "//div[contains(text(),'Task Types')]")
	private WebElement TaskTypeMenu;

	@FindBy(xpath = "//span[normalize-space()='New']")
	private WebElement TaskTypeNewBtn;

	@FindBy(xpath = "//input[@id='StepName']")
	private WebElement TaskTypeStepName;

	@FindBy(xpath = "//input[@id='Description']")
	private WebElement TaskTypeDescription;

	@FindBy(xpath = "//input[@id='UploadedName']")
	private WebElement TaskTypeUploadName;

	@FindBy(xpath = "//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down']")
	private WebElement TaskTypeFlowDropodown;

	@FindBy(xpath = "//li[@aria-label='Braided Wire']")
	private WebElement TaskTypeFlowDropodownValue;

	@FindBy(xpath = "//input[@id='StepNumber']")
	private WebElement TaskTypeStepNumber;

	@FindBy(xpath = "//span[normalize-space()='OK']")
	private WebElement TaskTypeOkBtn;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement TaskTypeSelectRadioBtn;


	@FindBy(xpath = "//span[normalize-space()='Edit']")
	private WebElement TaskTypeEditBtn;

	@FindBy(xpath = "//span[normalize-space()='Delete']")
	private WebElement TaskTypeDeleteBtn;

	@FindBy(xpath = "//input[contains(@class,'ng-star-inserted')]")
	private WebElement TaskTypeSearch;

	@FindBy(xpath = "//*[@id=\"exportButton\"]/span[2]")
	private WebElement TaskTypeExportBtn;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/webuilib-uuid-link/span/a")
	private WebElement SelectTaskType;

	@FindBy(xpath = "//span[normalize-space()='Select']")
	private WebElement TaskTypeCollectionSelectBtn;

	@FindBy(xpath = "//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down']")
	private WebElement TaskTypeCollectionNameDropdown;

	@FindBy(xpath = "//span[contains(text(),'PRO1 - ENGINEERING')]")
	private WebElement TaskTypeCollectionNameDropdownValue;

	@FindBy(xpath = "//span[normalize-space()='Machine Capabilities']")
	private WebElement TaskTypeCollectionMachineCapabilityTab;

	@FindBy(xpath = "(//span[@class='ui-button-text ui-clickable'][normalize-space()='Select'])[2]")
	private WebElement TaskTypeCollectionMachineCapabilitySelectBtn;

	@FindBy(xpath = "//li[@aria-label='Battery Cable Core Stripping']")
	private WebElement TaskTypeCollectionMachineCapabiltyNameValue;

	// file menu
	@FindBy(xpath = "//div[contains(text(),'Files')]")
	private WebElement fileMenu;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement SelectFileradiobtn;

	@FindBy(xpath = "//*[@id=\"Download\"]/span[2]")
	private WebElement DownloadFileBtn;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/webuilib-item-toolbar/p-dialog[1]/div/div[3]/p-footer/div/button[1]/span[2]")
	private WebElement YesDownloadFileBtn;

	public ResourcesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean PositiveSetPassword() {
		click(resources);
		click(organizationChart);
		click(userDizon);
		sendKeys(currentPassword, currentpass);
		sendKeys(NewPassword, newpass);
		sendKeys(confirmNewPassword, confnewpass);
		click(oK);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("dashboard");
		log.info("Set Password is Done.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}

	public boolean NegativeSetPassword() {
		click(resources);
		click(organizationChart);
		click(userDizon);
		click(setPassword);
		sendKeys(currentPassword, "Testing");
		sendKeys(NewPassword, "Testing");
		sendKeys(confirmNewPassword, "Testing");
		click(oK);
		boolean nlTest = visibilityCheck(errorMsg);
		log.info("Negative set password is Verified.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return nlTest;
	}

	public boolean Event() {
		click(resources);
		click(organizationChart);
		click(userDizon);
		click(newbtn);
		click(type);
		sendKeys(title, "Testing");
		sendKeys(description, "Testing");
		click(allday);
		click(start);
		click(end);
		click(oK);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("dashboard");
		log.info("Add Schedule Entry is Done.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}

	public boolean Shift() {
		click(resources);
		click(organizationChart);
		click(userDizon);
		click(shifts);
		click(select);
		click(shiftName);
		click(firstDay);
		click(lastDay);
		click(oK);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("dashboard");
		log.info("Add Schedule Entry is Done.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}

	public boolean Skills() {
		click(resources);
		click(organizationChart);
		click(userDizon);
		click(skills);
		click(select);
		click(skillsName);
		click(level);
		click(oK);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("dashboard");
		log.info("Add Schedule Entry is Done.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}

	public boolean Timekeeping() {
		click(resources);
		click(organizationChart);
		click(userDizon);
		click(timekeeping);
		click(add);
		click(workOrder);
		click(productionState);
		click(startTime);
		click(endTime);
		click(oK);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("dashboard");
		log.info("Add Schedule Entry is Done.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}

	public boolean AddBreakTime() {
		click(resources);
		click(breaktimes);
		click(newbtn);
		String str = generateRandomTestName();
		sendKeys(name, str);
		sendKeys(description, "Testing");
		click(oK);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Add New BreakTime.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}
	public boolean EditBreakTime() {
		click(resources);
		click(breaktimes);
		click(selectBreaktime);
		click(edit);
		String str = generateRandomTestName();
		name.clear();
		sendKeys(name, str);
		sendKeys(description, "Testing");
		click(oK);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Edit BreakTime Successful.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean DeleteBreakTime() {
		click(resources);
		click(breaktimes);
		click(selectBreaktime);
		click(delete);
		click(yes);
		log.info("Delete BreakTime.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}



	public boolean AddCapabilties() {
		click(resources);
		click(Capabilities);
		clickWithJS(CapabilitiesNewBtn);
		String str = generateRandomTestName();
		sendKeys(CapabilitiesName, str);
		sendKeys(CapabilitiesDescription, "Test");
		click(CapabilitiesOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Capabilities Added");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean AddCapabiltiesDuplicate() {
		click(resources);
		click(Capabilities);
		click(CapabilitiesNewBtn);
		String str = generateRandomTestName();
		sendKeys(CapabilitiesName, str);
		sendKeys(CapabilitiesDescription, "Testing1");
		click(CapabilitiesOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Duplicate Capabilities checked");
		//		click(newVersionMsgDismiss);
		//		click(dissmissYes);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;

	}

	public boolean EditCapabilties() {
		click(resources);
		click(Capabilities);
		click(SelectCapabilitiesradiobtn);
		click(EditCapabilitiesbtn);
		CapabilitiesName.clear();
		String str = generateRandomTestName();
		sendKeys(CapabilitiesName, str);
		sendKeys(CapabilitiesDescription, "abc test");
		click(CapabilitiesOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Capabilities Edited");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean Deletecapabilities() {
		click(resources);
		click(Capabilities);
		click(SelectCapabilitiesradiobtn);
		click(DeleteCapabilitiesbtn);
		click(yes);
		boolean plTest = driver.getCurrentUrl().contains("capabilities");
		System.out.println(plTest);
		log.info("Capabilities Deleted.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean CapabilitiesFilterMatching() {
		click(resources);
		click(Capabilities);
		click(CapabilitiesFilterDropdown);
		click(CapabilitiesFilterNameDeselect);
		click(CapabilitiesFilterOk);
		log.info("Capabilities Filter Working.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean CapabilitiesExport() {
		click(resources);
		click(Capabilities);
		click(CapabilitiesExportBtn);
		log.info("Capabilities Exported.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean CapabilitiesFilter() {
		click(resources);
		click(Capabilities);
		clickWithJS(CapabilitiesNameSort);
		click(CapabilitiesDescriptionSort);
		click(CapabilitiesStateSort);
		log.info("Capabilities  record Sorted.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean AddCompanies() {
		click(resources);
		click(companies);
		click(AddNewCompanies);
		String str = generateRandomTestName();
		sendKeys(CompanyName, str);
		sendKeys(CompanyLongName, str);
		sendKeys(CompanyAbn, "abc");
		click(CompanyType);
		click(CompanyTypeValue);
		click(CompanyCurrency);
		click(CompanyCurrencyValue);
		sendKeys(CompanyNotes, "Testing");
		//		click(CompanyPhoneNumberAddBtn);
		//		click(CompanyWorkType);
		//		click(CompanyWorkTypeDropdown);
		//		click(CompanyWorkTypeDropdownValue);
		//		System.out.println("88888888");
		//		click(CompanyWorkPhoneNumber);
		//		sendKeys(CompanyPhoneNumber, "876629182");
		//		System.out.println("12121212");
		//		click(CompanyEmailAddBtn);
		//		System.out.println("111111111");
		//		click(CompanyWorkEmailType);
		//		System.out.println("2");
		//		click(CompanyWorkEmailDropdown);
		//		click(CompanyWorkEmailDropdownValue);
		//		sendKeys(CompanyEmail, "appsierra@gmail.com");
		click(CompanyOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Companies Added");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean EditCompanies() {
		click(resources);
		click(companies);
		click(SelectCompaniesradiobtn);
		click(EditCompaniesbtn);
		CompanyName.clear();
		String str = generateRandomTestName();
		sendKeys(CompanyName, str);
		sendKeys(CompanyLongName, "Test");
		click(oK);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Companies Edited");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean DeleteCompanies() {
		click(resources);
		click(companies);
		click(SelectCompaniesradiobtn);
		click(DeleteCompaniesbtn);
		click(yes);
		log.info("Companies Deleted");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean CompaniesFilter() {
		click(resources);
		click(companies);
		click(CompanyFilter);
		click(CompanyFilterName);
		click(CompanyFilterLongName);
		click(CompanyFilterOk);
		log.info("Companies Filter Work Successfully");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean CompaniesExport() {
		click(resources);
		click(companies);
		click(CompaniesExportBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Companies Exported");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean CompaniesCollectionAddres() throws InterruptedException {
		click(resources);
		click(companies);
		click(CompaniesSelect);
		//		click(CompaniesAddressTab);
		click(CompaniesCollectionAddressNewBtn);
		Thread.sleep(3000L);
		click(CompaniesCollectionPurposeDropdown);
		click(CompaniesCollectionPurposeDropdownValue);
		sendKeys(companyDescription, "Testing");
		sendKeys(CompaniesCollectionAddressLine1, "abc");
		sendKeys(CompaniesCollectionAddressLine2, "pqr");
		sendKeys(CompaniesCollectionAddressLine3, "xyz");
		sendKeys(CompaniesCollectionAddressLine4, "qwe");
		click(CompaniesCollectionOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Companies Collection Address Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean AddContactPersons() {
		click(resources);
		click(ContactsPerson);
		click(AddContactPersonNewBtn);
		String str = generateRandomFirstName();
		String str1 = generateRandomLastName();
		sendKeys(ContactPersonName, str);
		click(ContactPersonTitleDropdown);
		click(ContactPersonTitleDropdownValue);
		sendKeys(ContactPersonFullName, str + str1);
		click(ContactPersonJobTitleDropdown);
		click(ContactPersonJobTitleDropdownValue);
		//		click(ContactPersonPhoneNumberAddBtn);
		//		click(ContactPersonPhoneNumberType);
		//		click(ContactPersonPhoneNumberTypeDropdown);
		//		click(ContactPersonPhoneNumberTypeDropdownValue);
		//		click(ContactPersonPhoneNumber);
		//		sendKeys(ContactPersonPhoneNumberValue, "9876543210");
		//		click(ContactPersonEmailAddBtn);
		//		click(ContactPersonEmailType);
		//		click(ContactPersonEmailTypeDropdown);
		//		click(ContactPersonEmailTypeDropdownValue);
		//		click(ContactPersonEmail);
		//		sendKeys(ContactPersonEmailValue, "jawed@gmail.com");
		click(ContactPersonOkBtn);

		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Contact Person Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean EditContactPersons() {
		click(resources);
		click(ContactsPerson);
		click(SelectCotactPersonradiobtn);
		click(EditContactPersonbtn);
		ContactPersonName.clear();
		String str = generateRandomFirstName();
		String str1 = generateRandomLastName();
		sendKeys(ContactPersonName, str+str1);
		click(ContactPersonTitleDropdown);
		click(ContactPersonTitleDropdownValue);
		sendKeys(ContactPersonFullName, "Raju");
		click(ContactPersonJobTitleDropdown);
		click(ContactPersonJobTitleDropdownValue);
		//		click(ContactPersonPhoneNumberAddBtn);
		//		click(ContactPersonPhoneNumberType);
		//		click(ContactPersonPhoneNumberTypeDropdown);
		//		click(ContactPersonPhoneNumberTypeDropdownValue);
		//		click(ContactPersonPhoneNumber);
		//		sendKeys(ContactPersonPhoneNumberValue, "9876543210");
		//		click(ContactPersonEmailAddBtn);
		//		click(ContactPersonEmailType);
		//		click(ContactPersonEmailTypeDropdown);
		//		click(ContactPersonEmailTypeDropdownValue);
		//		click(ContactPersonEmail);
		//		sendKeys(ContactPersonEmailValue, "abhishek@gmail.com");
		click(ContactPersonOkBtn);

		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Contact Person Edited.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean DeleteContactPersons() {
		click(resources);
		click(ContactsPerson);
		click(SelectCotactPersonradiobtn);
		click(DeleteContactPersonbtn);
		click(yes);

		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Contact Person Deleted.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean ContactPersonFilter() {
		click(resources);
		click(ContactsPerson);
		click(ContactPersonFilterDropdown);
		click(ContactPersonFilterName);
		click(ContactPersonFilterTitle);
		click(ContactPersonFilterDropdown);

		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Contact Person Filter Work Succesfully.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean ContactPersonExport() throws InterruptedException {
		click(resources);
		click(ContactsPerson);
		click(ContactPersonExportBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Contact Person Exported.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread.sleep(3000L);
		return true;
	}

	public boolean AddDepartment() {
		click(resources);
		click(Department);
		click(AddNewDepartment);
		String str = generateRandomTestName();
		sendKeys(name, str);
		sendKeys(description, "testing department");
		click(SelectDepartmentParent);
		click(DepartmentParent);
		click(DepartmentOk);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Department Added");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean EditDepartment() {
		click(resources);
		click(Department);
		click(SelectDepartmentradiobtn);
		click(EditDepartmentbtn);
		name.clear();
		String str = generateRandomTestName();
		sendKeys(name, str);
		sendKeys(description, "testing department");
		click(SelectDepartmentParent);
		click(DepartmentParent);
		click(DepartmentOk);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Department Edited");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean DeleteDepartment() {
		click(resources);
		click(Department);
		click(SelectDepartmentradiobtn);
		click(DeleteDepartmentbtn);
		click(YesDeleteDepartmentbtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Department Deleted");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean DepartmentFilter() {
		click(resources);
		click(Department);
		click(DepartmentFilterDropdown);
		click(DepartmentFilterName);
		click(DepartmentFilterDescription);
		click(DepartmentFilterDropdown);
		log.info("Department Filter Work Succesfully.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean DepartmentExport() {
		click(resources);
		click(Department);
		click(selectDepartment);
		click(DepartmentExportBtn);
		log.info("Department Exported.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean AddEmployee() throws InterruptedException {
		click(resources);
		click(Employees);
		click(EmployeesNewBtn);
		String str = generateRandomTestName();
		sendKeys(EmployeesUserName,str);
		String num = generateRandomNumber();
		sendKeys(EmployeesNumber,num);
		click(EmployeesTitleDropdown);
		click(EmployeesTitleDropdownValue);
		String str1 = generateRandomTestName();
		sendKeys(EmployeesFullName,str1);
		click(EmployeesDepartmentDropdown);
		click(EmployeesDepartmentDropdownValue);
		sendKeys(EmployeesJobTitle,"test");
		sendKeys(EmployeesTaxId,"test");
		click(EmployeesDateOfHire);
		click(EmployeesDateOfHireValue);
		click(EmployeesManager);
		click(EmployeesOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Employee Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}
	public boolean EditEmployee() {
		click(resources);
		click(Employees);
		click(SelectEmployeeradioBtn);
		click(EmployeesEditBtn);
		EmployeesUserName.clear();
		String str = generateRandomTestName();
		sendKeys(EmployeesUserName,str);
		String num = generateRandomNumber();
		sendKeys(EmployeesNumber,num);
		click(EmployeesTitleDropdown);
		click(EmployeesTitleDropdownValue);
		String str1 = generateRandomTestName();
		sendKeys(EmployeesFullName,str1);
		click(EmployeesDepartmentDropdown);
		click(EmployeesDepartmentDropdownValue);
		sendKeys(EmployeesJobTitle,"test");
		sendKeys(EmployeesTaxId,"test");
		click(EmployeesDateOfHire);
		click(EmployeesDateOfHireValue);
		click(EmployeesManager);
		click(EmployeesOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Employee Edited.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}
	public boolean DeleteEmployee() {
		click(resources);
		click(Employees);
		click(SelectEmployeeradioBtn);
		click(EmployeesDeleteBtn);
		click(YesDeleteEmployees);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("employees");
		log.info("Employee Deleted.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}


	public boolean EmployeesSetPassword() {
		click(resources);
		click(Employees);
		click(SelectEmployeeradioBtn);
		click(EmployeesSetPasswordBtn);
		sendKeys(EmployeeEnterYOURPassword, "testing");
		sendKeys(EmployeeNewPasswordForUser, "testingpassword");
		sendKeys(EmployeeConfirmNewPasswordForUser, "testingpassword");
		click(EmployeesOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("employees");
		log.info("Set Password Succesfully.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}
	public boolean EmployeesFilterMatching() {
		click(resources);
		click(Employees);
		sendKeys(EmployeeSearch,"ALBERTO");
		log.info("Employee Record Matched");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean EmployeesFilterNoMatching() {
		click(resources);
		click(Employees);
		sendKeys(EmployeeSearch,"mdhshs");
		log.info("Employee Record Not Matched");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean EmployeesUsernameSort() {
		click(resources);
		click(Employees);
		//		click(EmployeeUsernameColumn);
		log.info("Employee Record Sorted");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean EmployeesVerifyHistory() {
		click(resources);
		click(Employees);
		click(EmployeeSelect);
		//		click(EmployeeHistoryTab);
		log.info("Verify Employee History");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean EmployeesCollectionEvent() throws InterruptedException {
		click(resources);
		click(Employees);
		click(EmployeeUserName);
		click(EmployeeCollectionEventAddbtn);
		click(EmployeeScheduleEntryType);
		click(EmployeeScheduleEntryTypeValue);
		sendKeys(EmployeeScheduleEntryTitle, "testing");
		sendKeys(EmployeeScheduleEntryDescription, "testingdescription");
		click(EmployeeScheduleEntryAllday);
		Thread.sleep(3000L);
		click(EmployeeStart);
		Thread.sleep(3000L);
		click(EmployeesStartValue);
		Thread.sleep(3000L);
		clickWithJS(StartTimeClick);
		//		click(EmployeesEnd);
		//		click(EmployeesEndValue);
		clickWithJS(ok);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("employees");
		log.info("Schedule Entry Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean EmployeesCollectionShift() throws InterruptedException {
		click(resources);
		click(Employees);
		click(EmployeeUserName);
		Thread.sleep(3000L);
		click(EmployeeCollectionShiftTab);
		click(EmployeeCollectionShiftSelectBtn);
		click(EmployeeCollectionShiftName);
		click(EmployeeCollectionShiftNameValue);
		click(EmployeeCollectionShiftFirstDay);
		click(EmployeeCollectionShiftFirstDayValue);
		Thread.sleep(3000L);
		click(EmployeeCollectionShiftLastDay);
		Thread.sleep(3000L);
		click(EmployeeCollectionShiftLastDayValue);
		//		click(FirstDayClick);
		click(ok);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("Testing1");
		log.info("Shift Schedule Added.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}

	public boolean EmployeesCollectionSkill() {
		click(resources);
		click(Employees);
		click(EmployeeUserName);
		click(EmployeeCollectionSkillsTab);
		click(EmployeeCollectionSkillsSelectBtn);
		click(EmployeeCollectionSkillsName);
		click(EmployeeCollectionSkillsNameValue);
		click(EmployeesSkillsLevel);
		click(EmployeesShiftOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("Testing1");
		log.info("Skill Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean EmployeesCollectionTimekeeping() throws InterruptedException {
		click(resources);
		click(Employees);
		click(EmployeeUserName);
		click(EmployeeCollectionTimekeepingTab);
		click(EmployeeCollectionTimekeepingAddBtn);
		click(EmployeeCollectionTimekeepingWorkOrder);
		sendKeys(EmployeeCollectionTimekeepingWorkOrder, "MRF-00000084");
		sendKeys(EmployeeCollectionTimekeepingWorkOrder,Keys.ENTER);
		Thread.sleep(10000L);
		click(EmployeeCollectionTimekeepingProductionState);
		Thread.sleep(2000L);
		click(EmployeeCollectionTimekeepingProductionStateValue);
		Thread.sleep(2000L);
		click(EmployeeCollectionTimekeepingStartDate);
		Thread.sleep(2000L);
		click(EmployeeCollectionTimekeepingStartDateValue);
		Thread.sleep(2000L);
		click(EmployeeCollectionTimekeepingWorkOrder);
		Thread.sleep(2000L);
		sendKeys(EmployeeCollectionTimekeepingNotes,"Test");
		click(EmployeesTimekeepingOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("Testing1");
		log.info("TimeKeeping  Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean AddMachine() throws InterruptedException {
		click(resources);
		click(Machines);
		click(AddNewMachine);
		String str = generateRandomFirstName();
		sendKeys(MachineName, str);
		sendKeys(MachineModel, str);
		sendKeys(MachineSerialNumber, str);
		click(MachineOk);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Machines Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean EditMachine() throws InterruptedException {
		click(resources);
		click(Machines);
		click(SelectMachineradiobtn);
		click(Editmachinebtn);
		MachineName.clear();
		String str = generateRandomFirstName();
		sendKeys(MachineName, str);
		sendKeys(MachineModel, str);
		sendKeys(MachineSerialNumber, str);
		click(MachineOk);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Machines Edited.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean DeleteMachine() throws InterruptedException {
		click(resources);
		Thread.sleep(3000L);
		click(Machines);
		click(SelectMachineradiobtn);
		click(DeleteMachinebtn);
		click(yesDeleteMachine);
		log.info("Machines Deleted.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean MachineCollectionCapabilities() throws InterruptedException {
		click(resources);
		click(Machines);
		click(MachineCollectionName);
		Thread.sleep(3000L);
		clickWithJS(MachineCollectionCapabilitiesSelectBtn);
		click(MachineCollectionCapabilitiesMemeberName);
		click(MachineCollectionCapabilitiesMemeberNameValue);
		click(MachineCollectionCapabilitiesOkBtn);
		log.info("Capabilities Member Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean MachineCollectionEvents() {
		click(resources);
		click(Machines);
		click(MachineCollectionName);
		click(machineCollectionEventTab);
		click(MachineCollectionEventNewBtn);
		click(EmployeeScheduleEntryType);
		click(EmployeeScheduleEntryTypeValue);
		sendKeys(EmployeeScheduleEntryTitle, "testing");
		sendKeys(EmployeeScheduleEntryDescription, "testingdescription");
		click(EmployeeScheduleEntryAllday);
		click(EmployeeScheduleEntryStart);
		click(EmployeeScheduleEntryStartValue);
		click(EmployeeScheduleEntrytype);
		//		click(yes);
		click(EmployeesScheduleEntryOkBtn);
		log.info("Capabilities Event Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean MachineFilter() {
		click(resources);
		click(Machines);
		click(MachineFilterDropdown);
		click(MachineFilterName);
		click(MachineFilterModel);
		click(MachineFilterSerialNumber);
		click(MachineFilterDropdown);
		log.info("Machine Filter Wrok Successfully.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean AddShifts() {
		click(resources);
		click(Shifts);
		click(AddNewShift);
		String str = generateRandomTestName();
		sendKeys(ShiftName, str);
		click(ShiftDays);
		click(ShiftMonday);
		click(ShiftDays);
		click(FromHours);
		click(FromHoursValues);
		click(FromHours);
		click(ThruHours);
		click(ThruHoursvalues);
		click(ThruHours);
		click(ShiftOk);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Shift Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean EditShifts() {
		click(resources);
		click(Shifts);
		click(SelectShiftradiobtn);
		click(EditShiftbtn);
		String str = generateRandomTestName();
		ShiftName.clear();
		sendKeys(ShiftName, str);
		click(ShiftDays);
		click(ShiftMonday);
		click(ShiftDays1);
		click(FromHours);
		click(FromHoursValues);
		click(FromHours);
		click(ThruHours);
		click(ThruHoursvalues);
		click(ThruHours);
		click(ShiftOk);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Shift Edited.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean DeleteShifts() {
		clickWithJS(resources);
		click(Shifts);
		click(SelectShiftradiobtn);
		click(delete);
		click(yes);
		log.info("Shift Deleted.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean ShiftCollectionBreak() {
		click(resources);
		click(Shifts);
		click(ShiftNameRecord);
		click(EmployeeCollectionShiftSelectBtn);
		click(EmployeeCollectionShiftName);
		click(EmployeeCollectionShiftNameValue);
		//		click(EmployeeCollectionShiftFirstDay);
		//		click(EmployeeCollectionShiftFirstDayValue);
		//		click(EmployeeCollectionShiftLastDay);
		//		click(EmployeeCollectionShiftLastDayValue);
		click(EmployeesShiftOkBtn);
		log.info("Shift Collection Break Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean AddSkills() {
		click(resources);
		click(Skills);
		click(AddNewSkills);
		String str = generateRandomTestName();
		sendKeys(SkillsName, str);
		sendKeys(SkillsDescription, "test description");
		click(SkillsOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Skills Added.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean EditSkills() {
		click(resources);
		click(Skills);
		click(SelectSkillradiobtn);
		click(EditSkillbtn);
		SkillsName.clear();
		String str = generateRandomTestName();
		sendKeys(SkillsName, str);
		click(SkillsOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("Skills Edited.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}

	public boolean DeleteSkills() {
		click(resources);
		click(Skills);
		click(SelectSkillradiobtn);
		click(deleteSkillbtn);
		click(yes);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Skills Deleted.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean SkillFilter() {
		click(resources);
		click(Skills);

		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Skills Filter Working.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean AddTaskTypes() {
		click(resources);
		click(TaskTypeMenu);
		click(TaskTypeNewBtn);
		String str = generateRandomTestName();
		sendKeys(TaskTypeStepName,str);
		sendKeys(TaskTypeDescription,"test description");
		sendKeys(TaskTypeUploadName,"abcdef");
		click(TaskTypeFlowDropodown);
		click(TaskTypeFlowDropodownValue);
		sendKeys(TaskTypeStepNumber,"123");
		click(TaskTypeOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("TaskType Added");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}
	public boolean EditTaskTypes() {
		click(resources);
		click(TaskTypeMenu);
		click(TaskTypeSelectRadioBtn);
		click(TaskTypeEditBtn);
		TaskTypeStepName.clear();
		String str = generateRandomTestName();
		sendKeys(TaskTypeStepName,str);
		sendKeys(TaskTypeDescription,"test description");
		sendKeys(TaskTypeUploadName,"abcdef");
		click(TaskTypeFlowDropodown);
		click(TaskTypeFlowDropodownValue);
		sendKeys(TaskTypeStepNumber,"123");
		click(TaskTypeOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains(str);
		System.out.println(plTest);
		log.info("TaskType Edited");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}
	public boolean DeleteTaskTypes() {
		click(resources);
		click(TaskTypeMenu);
		click(TaskTypeSelectRadioBtn);
		click(TaskTypeDeleteBtn);
		click(yes);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("TaskType Deleted");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean TaskTypesFilterMatching() {
		click(resources);
		click(TaskTypeMenu);
		sendKeys(TaskTypeSearch,"Development Engineering");
		log.info("TaskType Record Matched");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean TaskTypesFilterNotMatching() {
		click(resources);
		click(TaskTypeMenu);
		sendKeys(TaskTypeSearch,"dhdlhasd");
		log.info("TaskType Record NOt Matched");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean TaskTypeExport() {
		click(resources);
		click(TaskTypeMenu);
		click(TaskTypeExportBtn);
		log.info("TaskType Exported");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean TaskTypeCollectionSkills() {
		click(resources);
		click(TaskTypeMenu);
		click(SelectTaskType);
		click(TaskTypeCollectionSelectBtn);
		click(TaskTypeCollectionNameDropdown);
		click(TaskTypeCollectionNameDropdownValue);
		click(TaskTypeOkBtn);
		log.info("TaskType Collection Employee Skill Added");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean TaskTypeCollectionMachineCapabilty() {
		click(resources);
		click(TaskTypeMenu);
		click(SelectTaskType);
		click(TaskTypeCollectionMachineCapabilityTab);
		click(TaskTypeCollectionMachineCapabilitySelectBtn);
		click(TaskTypeCollectionNameDropdown);
		click(TaskTypeCollectionMachineCapabiltyNameValue);
		click(TaskTypeOkBtn);
		log.info("TaskType Collection Machine Capability Added");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean DownloadFile() {
		click(resources);
		click(fileMenu);
		click(SelectFileradiobtn);
		click(DownloadFileBtn);
		click(YesDownloadFileBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("files");
		log.info("File Downloaded ");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return plTest;
	}
}
