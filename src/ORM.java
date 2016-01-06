/**
 * Created by erxyi on 06.01.16.
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Console;
import java.util.Scanner;

import workshop.entities.*;
public class ORM {
 /*   public static String getPassword(Console c)
    {
        char pass[] = c.readPassword("User defined in persistence.xml password:");
        return new String(pass);
    }
*/
    public static String getPassword(Scanner s)
    {
        System.out.print("Password:");
        return s.nextLine();
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        //Console console = System.console();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit", getProperties(s));
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT c from CustomersEntity c");
        List<CustomersEntity> results = query.getResultList();

        for(CustomersEntity c:results)
        {
            System.out.println(c.getFirstName() + " " + c.getLastName());
        }
    }

    private static Map<String, String> getProperties(Scanner s) {
        Map<String, String> properties = new HashMap<String, String>();
        properties.put("javax.persistence.jdbc.url","jdbc:oracle:thin:@ora3.elka.pw.edu.pl:1521:ora3inf");
        properties.put("javax.persistence.jdbc.driver", "oracle.jdbc.OracleDriver");
        properties.put("javax.persistence.jdbc.user", "jpalczew");
        properties.put("javax.persistence.jdbc.password", getPassword(s));
        return properties;
    }


}
