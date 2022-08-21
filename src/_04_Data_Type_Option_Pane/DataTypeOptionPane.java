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
        int type = JOptionPane.showOptionDialog(null, "What Primitive Data Type Would You LIke TO Learn More About?", "Data Type Selector", 0, 1, null, dataTypes, null);
        
        switch (type) {
        case 0:
        	JOptionPane.showMessageDialog(null,"A Boolean");
        	break;
        case 1:
        	JOptionPane.showMessageDialog(null,"A Char");
        	break;
        case 2:
        	JOptionPane.showMessageDialog(null,"A Byte");
        	break;
        case 3:
        	JOptionPane.showMessageDialog(null,"A Short");
        	break;
        case 4:
        	JOptionPane.showMessageDialog(null,"An Int");
        	break;
        case 5:
        	JOptionPane.showMessageDialog(null,"A Long");
        	break;
        case 6:
        	JOptionPane.showMessageDialog(null," A Float");
        	break;
        case 7:
        	JOptionPane.showMessageDialog(null,"A Double");
        	break;
        default:
        	JOptionPane.showMessageDialog(null,"An Error Occured In The Case Statement");
        	break;
        }
    }
}
