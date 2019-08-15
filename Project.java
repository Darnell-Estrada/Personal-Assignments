import javax.swing.JOptionPane;

public class Project{
    public static void main(String[] args){
        Rectangle[] rect = null;
        rect = createRects(rect);
        rect = inputRects(rect);
        dispRects(rect);

        System.exit(0);
    }

    private static Rectangle[] createRects(Rectangle[] arr){
        arr = new Rectangle[5];

        for (int i = 0; i < arr.length; i++){
            arr[i] = new Rectangle(1.0, 1.0);
        }

        return arr;
    }

    private static Rectangle[] inputRects(Rectangle[] arr){
        String length;
        String width;
        double widthDub;
        double lengthDub;

        for (int i = 0; i < arr.length; i++){
            width = JOptionPane.showInputDialog(String.format("Enter a width for Rectangle #%d:", i + 1));
            length = JOptionPane.showInputDialog(String.format("Enter a length for Rectangle #%d:", i + 1));

            widthDub = Double.parseDouble(width);
            lengthDub = Double.parseDouble(length);

            arr[i].setWidth(widthDub);
            arr[i].setLength(lengthDub);
        }

        return arr;
    }

    private static void dispRects(Rectangle[] arr){
        for (Rectangle obj : arr){
            JOptionPane.showMessageDialog(null,
                                          String.format("Rectangle width: %.2f", obj.getWidth()));
            JOptionPane.showMessageDialog(null,
                                          String.format("Rectangle length: %.2f", obj.getLength()));
            JOptionPane.showMessageDialog(null,
                                          String.format("Rectangle area: %.2f", obj.getArea()));
        }
    }
}