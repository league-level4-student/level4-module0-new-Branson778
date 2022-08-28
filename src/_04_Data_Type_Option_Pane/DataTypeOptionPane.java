package _04_Data_Type_Option_Pane;

import javax.swing.JOptionPane;

public class DataTypeOptionPane {
    private enum DataType{
    	BOOLEAN(1) , CHAR(16), BYTE(8), SHORT(16), INT(32), LONG(64), FLOAT(32), DOUBLE(64);
    	private int bits;
    	DataType(int bits) {
    		 this.bits = bits;
		}

    }
    public static void main(String[] args) {
        DataType[] dataTypes = DataType.values();
        int type = JOptionPane.showOptionDialog(null, "What Primitive Data Type Would You Like To Learn More About?", "Data Type Selector", 0, 1, null, dataTypes, null);
        
        switch (type) {
        case 0:
        	JOptionPane.showMessageDialog(null,"A Boolean Is A 1-Bit Data Types That Holds A True/False Statement.");
        	break;
        case 1:
        	JOptionPane.showMessageDialog(null,"A Char Is A 16-Bit Data Type That Holds 1 Unicode Character.");
        	break;
        case 2:
        	JOptionPane.showMessageDialog(null,"A Byte Is An 8-Bit Data Type That Holds Numbers Which Is Designed To Save Memory.");
        	break;
        case 3:
        	JOptionPane.showMessageDialog(null,"A Short Is A 16-Bit Data Type That Holds Numbers Which Is Designed To Save Memory.");
        	break;
        case 4:
        	JOptionPane.showMessageDialog(null,"An Int Is A 32-Bit Data Type That Holds Numbers Which Is Designed To Be The Basic Number Type.");
        	break;
        case 5:
        	JOptionPane.showMessageDialog(null,"A Long Is A 64-Bit Data Type That Holds Numbers Which Is Designed To Hold Almost Any Number You Throw At It.");
        	break;
        case 6:
        	JOptionPane.showMessageDialog(null," A Float Is A 32-Bit Data Type That Holds Numbers And Decimals Which Is Designed To Save Memory.");
        	break;
        case 7:
        	JOptionPane.showMessageDialog(null,"A Double Is A 64-Bit Data Type That Holds Numbers And Decimals Which Is Designed To Be The Basic Number Type That Holds Decimals.");
        	break;
        default:
        	JOptionPane.showMessageDialog(null,"An Error Occured In The Case Statement");
        	break;
        }
    }
}
