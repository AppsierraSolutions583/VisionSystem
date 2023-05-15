package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.LoginPage;
import com.vision.pageObjects.ResourcesPage;

public class ResourcesPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test
	public void Resource() throws InterruptedException {
		LoginPage lp = new LoginPage(TestBase.driver);
		lp.positiveLoginTest();
		ResourcesPage rp = new ResourcesPage(TestBase.driver);

		// BreakTime
		sa.assertTrue(rp.AddBreakTime());
		sa.assertTrue(rp.EditBreakTime());
		sa.assertTrue(rp.DeleteBreakTime());

		// Capabilities
		sa.assertTrue(rp.AddCapabilties());
		sa.assertTrue(rp.AddCapabiltiesDuplicate());
		sa.assertTrue(rp.EditCapabilties());
		sa.assertTrue(rp.Deletecapabilities());
		sa.assertTrue(rp.CapabilitiesFilterMatching());
		sa.assertTrue(rp.CapabilitiesExport());
		sa.assertTrue(rp.CapabilitiesFilter());

		// Companies
		sa.assertTrue(rp.AddCompanies());
		sa.assertTrue(rp.EditCompanies());
		sa.assertTrue(rp.DeleteCompanies());
		sa.assertTrue(rp.CompaniesFilter());
		sa.assertTrue(rp.CompaniesExport());
		// sa.assertTrue(rp.CompaniesCollectionAddres());

		// Contact Person
		sa.assertTrue(rp.AddContactPersons());
		sa.assertTrue(rp.EditContactPersons());
		sa.assertTrue(rp.DeleteContactPersons());
		sa.assertTrue(rp.ContactPersonFilter());
		sa.assertTrue(rp.ContactPersonExport());

		// Department
		sa.assertTrue(rp.AddDepartment());
		sa.assertTrue(rp.EditDepartment());
		sa.assertTrue(rp.DeleteDepartment());
		sa.assertTrue(rp.DepartmentFilter());
		sa.assertTrue(rp.DepartmentExport());

		// Employee
		sa.assertTrue(rp.AddEmployee());
		sa.assertTrue(rp.EditEmployee());
		sa.assertTrue(rp.DeleteEmployee());
		sa.assertTrue(rp.EmployeesFilterMatching());
		sa.assertTrue(rp.EmployeesFilterNoMatching());
		sa.assertTrue(rp.EmployeesUsernameSort());
		sa.assertTrue(rp.EmployeesVerifyHistory());
		// sa.assertTrue(rp.EmployeesCollectionEvent());
		// sa.assertTrue(rp.EmployeesCollectionShift());
		// sa.assertTrue(rp.EmployeesCollectionSkill());issue
		// sa.assertTrue(rp.EmployeesCollectionTimekeeping());

		// Machine
		sa.assertTrue(rp.AddMachine());
		sa.assertTrue(rp.EditMachine());
		sa.assertTrue(rp.DeleteMachine());
		sa.assertTrue(rp.MachineCollectionCapabilities());
		sa.assertTrue(rp.MachineCollectionEvents());
		sa.assertTrue(rp.MachineFilter());

		// Shift
		sa.assertTrue(rp.AddShifts());
		// sa.assertTrue(rp.EditShifts());
		sa.assertTrue(rp.DeleteShifts());
		// sa.assertTrue(rp.ShiftCollectionBreak());

		// Skill
		sa.assertTrue(rp.AddSkills());
		sa.assertTrue(rp.EditSkills());
		sa.assertTrue(rp.DeleteSkills());
		sa.assertTrue(rp.SkillFilter());

		// Task Type
		sa.assertTrue(rp.AddTaskTypes());
		sa.assertTrue(rp.EditTaskTypes());
		sa.assertTrue(rp.DeleteTaskTypes());
		sa.assertTrue(rp.TaskTypesFilterMatching());
		sa.assertTrue(rp.TaskTypesFilterNotMatching());
		sa.assertTrue(rp.TaskTypeExport());
		// sa.assertTrue(rp.TaskTypeCollectionSkills());
		// sa.assertTrue(rp.TaskTypeCollectionMachineCapabilty());

		// File
		sa.assertTrue(rp.DownloadFile());

	}
}
