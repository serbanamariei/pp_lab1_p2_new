import java.io.File;

fun main()
{
    val file=File("input.txt");
    if(file.exists())
    {
        val continut=file.readText();

        val rez=continut.replace(Regex("[^\\p{L}\\p{Z}\\d]"),"");

        println("Text rezultat dupa eliminarea punctuatiei:\n");
        println(rez);
    }
}