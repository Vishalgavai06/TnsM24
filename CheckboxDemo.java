/*<applet code=CheckboxDemo.class width=500 height=500>
</applet>*/
import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class CheckboxDemo extends Applet 
{

public void init()
 {

CheckboxGroup checkboxGroup = new CheckboxGroup();
Checkbox java = new Checkbox("Java", checkboxGroup, true);
Checkbox cpp = new Checkbox("C++", checkboxGroup, true);
Checkbox phython = new Checkbox("Phython", checkboxGroup, true);
add(java);
add(cpp);
add(phython);
}
}