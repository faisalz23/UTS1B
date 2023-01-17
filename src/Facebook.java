import java.util.ArrayList;
import java.util.Scanner;

public class Facebook {
    private String Posted;
    private String UserName;
    private String FullName;
    private String myPost;
    private String halaman;
    private String ShowNumberOfPost;

    public String getPosted() {
        return Posted;
    }
    public void setPosted(String Posted) {
        this.Posted = Posted;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getmyPost() {
        return myPost;
    }

    public void setmyPost(String myPost) {
        this.myPost = myPost;
    }

    public String getHalaman() {
        return halaman;
    }
    public String ShowNumberOfPost() {
        return ShowNumberOfPost;
    }
    public void setHalaman(String halaman) {
        this.halaman = halaman;
    }
    public Facebook(){
    }

    public Facebook(String pst,String brd,String mrt,String mpst,String hlm) {
        this.Posted = pst;
        this.UserName = brd;
        this.myPost = mpst;
        this.FullName = mrt;
        this.halaman = hlm;
    }
    public static void main(String []args) {
        int jumPost = 4;
        Scanner sc = new Scanner(System.in);
        Facebook user1 = new Facebook();
        user1.setUserName("dbgb4a");
        user1.setFullName("Debby Gibson");
        ArrayList<String> myPost = new ArrayList<>();
        for(int index=0;index<jumPost;index++){
            myPost.add(sc.nextLine());
        }
        user1.setPosted(myPost);
        System.out.println("Total Posted : " + user1.ShowNumberOfPost());
}
}