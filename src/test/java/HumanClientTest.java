import m.ermolaev.Bar;
import m.ermolaev.HumanClient;
import m.ermolaev.StringBar;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HumanClientTest {
    @Test
    public void addObserver() {
        Bar bar = new StringBar();
        HumanClient clientMock = Mockito.mock(HumanClient.class);
        bar.addObserver(clientMock);
        Mockito.verify(clientMock,
                Mockito.never()).happyHourStarted(bar);
        Mockito.verify(clientMock,
                Mockito.never()).happyHourEnded(bar);
        bar.startHappyHour();
        //error
        Mockito.verify(clientMock,
                Mockito.times(1)).happyHourStarted(bar);
        Mockito.verify(clientMock,
                Mockito.never()).happyHourEnded(bar);
        bar.endHappyHour();
        Mockito.verify(clientMock,
                Mockito.times(1)).happyHourStarted(bar);
        Mockito.verify(clientMock,
                Mockito.times(1)).happyHourEnded(bar);

    }

    @Test
    public void removeObserver() {
        Bar bar = new StringBar(null);
        HumanClient clientMock = Mockito.mock(HumanClient.class);
        bar.addObserver(clientMock);
        bar.removeObserver(clientMock);
        bar.startHappyHour();
        bar.endHappyHour();
        Mockito.verify(clientMock,
                Mockito.never()).happyHourStarted(bar);
        Mockito.verify(clientMock,
                Mockito.never()).happyHourEnded(bar);
    }
}
