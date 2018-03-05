package observerPattem.myObserverPattern.subjectMenu;

import observerPattem.myObserverPattern.observerMenu.Observer;

/**
 * Created by KEY on 2018/3/5.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
