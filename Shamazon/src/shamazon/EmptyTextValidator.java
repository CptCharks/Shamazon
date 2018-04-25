/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 * Verifies that a TextField is not empty
 * @author Luke
 */
public class EmptyTextValidator extends ValidatorBase
{

    /**
     * Makes a new EmptyTextValidator
     * @param input the component to validate
     */
    public EmptyTextValidator(JComponent input)
    {
        super(input);
    }
    
    /**
     * Validates the text
     * @param input the component to be validated
     * @return true if the text is not empty, otherwise false
     */
    @Override
    public boolean ValidateInput(JComponent input)
    {
        String text = ((JTextField)input).getText();
      
        return !"".equals(text);
    }
}
