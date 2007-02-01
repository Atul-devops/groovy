package groovy.bugs

import javax.swing.JButton
import javax.swing.JPanel

/**
 * @version $Revision$
 */
class PropertyBug extends GroovyTestCase {
     
    void testBug() {
        def panel = new JPanel()
        def bean = new JButton()
        
        panel.add(bean)
        
        def value = bean.parent
        assert value != null
    }
}