package pkg;

import java.io.IOException;

public interface SnackVMInterface {

    void printSnacksMenu();

	void requestedNumberSnack(int pressedNumberSnack) throws IOException;
    
    void printPayRules();


}