package com.company;
import java.sql. *;
import java.util. *;
public class JobOfferDAO {
    public ArrayList<JobOffer> list() throws Exception {
        //Fill your code here
        DBConnection x = new DBConnection();
        Connection c = x.Connection();
        ArrayList<JobOffer> output = new ArrayList<>();
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery("select * from job_offer");
        while(rs.next()){
            JobOffer s = new JobOffer(rs.getInt("id"),rs.getString("job_title"),
                    rs.getString("job_description"),rs.getString( "company_name"),rs.getDouble("package_per_annum"),
                    rs.getString("contact"));
            output.add(s);
        }


        return output;
    }

    public void delete(Integer id) throws Exception {
        //Fill your code here
        DBConnection x = new DBConnection();
        Connection c = x.Connection();
        Statement st = c.createStatement();
        try{
            st.execute("delete from job_offer where sid = "+id);
        }catch(Exception e){
        }
    }

    public void insertRecord(JobOffer sobj) throws Exception{
        //Fill your code here
        DBConnection x = new DBConnection();
        Connection c = x.Connection();
        Statement st = c.createStatement();
        st.execute("insert into job_offer values ("+sobj.sid+",\'"+sobj.jobTitle+"\',\'"+sobj.jobDescription+"\',\'"+sobj.companyName+"\',\'"+sobj.packagePerAnnum+",\'"+sobj.contact+")");
    }

    public void update(Integer bid, double packagePerAnnum)throws Exception {
        //Fill your code here
        DBConnection x = new DBConnection();
        Connection c = x.Connection();
        Statement st = c.createStatement();
        try{
            st.execute("update job_offer where sid = "+bid);
        }catch(Exception e){
        }
    }

    public ArrayList<JobOffer> select() throws Exception {
        //Fill your code here
        DBConnection x = new DBConnection();
        Connection c = x.Connection();
        ArrayList<JobOffer> output = new ArrayList<>();
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery("select * from student");
        while(rs.next()){
            JobOffer s = new JobOffer(rs.getInt("sid"),rs.getString("jobTitle"),
                    rs.getString("jobDescription"),rs.getString( "companyName"),rs.getDouble("packagePerAnnum"),rs.getString("contact"));
            output.add(s);
        }

        return output;
    }
}
