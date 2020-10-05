package lab2.ex1;

public class TestAuthor
{
    public TestAuthor()
    {
        Author n1=new Author("Masha", "mawill@mail.ru ", 'w');
        System.out.println(n1.getName());
        System.out.println(n1.getEmail());
        System.out.println(n1.getGender());
        n1.setEmail("blackhangover@mail.ru");
        System.out.println(n1.toString());
    }
}
