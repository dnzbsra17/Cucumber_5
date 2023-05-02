package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTableOrnek {
    @When("Write usurname {string}")
    public void writeUsurname(String userName) {
        System.out.println("userName = " + userName);

    }

    @And("Write usurname and Password {string} and {string}")
    public void writeUsurnameAndPasswordAnd(String userName, String Password) {
        System.out.println("userName and Password = " + userName+" "+Password);
    }


    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable elemanlar) {
        List<String> listElementler=elemanlar.asList(String.class);
        for (String u:listElementler ){
            System.out.println("u = " + u);
        }

    }

    @And("Write usurname and password DataTable")
    public void writeUsurnameAndPasswordDataTable(DataTable elemanlar)
    {
        List<List<String>> listElemanlar=elemanlar.asLists(String.class);
        for (int i = 0; i < listElemanlar.size() ; i++)
        {
            System.out.println("listElemanlar = " + listElemanlar.get(i).get(0)+" "+ //username
                    listElemanlar.get(i).get(1)); //password

        }
    }
}
