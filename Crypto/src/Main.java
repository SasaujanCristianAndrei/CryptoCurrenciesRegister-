import controllers.MainController;
import models.History;
import views.HistoryView;
import views.MainView;

public class Main {
    public static void main(String[] args) {

        MainView mainView=new MainView();
        HistoryView historyView=new HistoryView();
        History history=new History();
        MainController mainController=new MainController(mainView,historyView,history);
    }
}
