package e2;

import java.util.*;

public interface Observer {

    public void update(Observable o, Accion accion);
}