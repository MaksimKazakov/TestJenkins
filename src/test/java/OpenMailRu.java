import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class OpenMailRu {
    @Test
    void openSite(){
        open("https://mail.ru");
    }
    
}
