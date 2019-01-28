package week2;
public class CakeStore extends BaseCakeStore{
public  Cake createCake(String type){
    Cake cake;
    switch (type.toLowerCase())
    {
        case "choclatecake":
            cake = new ChoclateCake();
            break;
        case "chesscake":
            cake = new ChessCake();
            break;
        default: throw new IllegalArgumentException("No such a Cake.");
    }
    cake.addnut();
    cake.addstrawbery();
    cake.addnothing();
    cake.makeCake();
    return cake;
    }
}
