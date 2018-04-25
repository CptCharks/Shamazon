/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shamazon;

import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.border.Border;

/**
 * Provides an abstract base class for input validation which highlights
 * a component's border red when it contains an invalid input
 * @author Luke
 */
public abstract class ValidatorBase extends InputVerifier
{
    private Border originalBorder;
    private Border highlightBorder = BorderFactory.createLineBorder(java.awt.Color.RED);
    
    /**
     * 
     * @param input the component the validator will be used for
     */
    public ValidatorBase(JComponent input)
    {
        originalBorder = input.getBorder();
    }
    
    /**
     *
     * @param input the component the validator will be used for
     * @param highlightBorder the border which will be used to highlight invalid inputs
     */
    public ValidatorBase(JComponent input, Border highlightBorder)
    {
        originalBorder = input.getBorder();
        this.highlightBorder = highlightBorder;
    }
    
    @Override
    public final boolean verify(JComponent input)
    {
        if(ValidateInput(input))
        {
            input.setBorder(originalBorder);
            return true;
        }
        else
        {
            input.setBorder(highlightBorder);
            return false;
        }
    }
    
    /**
     * Used to validate input into a JComponent
     * @param input the input component
     * @return true if the input is valid, otherwise false
     */
    public abstract boolean ValidateInput(JComponent input);
    
    /**
     * 
     * @return the border which will be used to highlight an invalid input
     */
    public Border GetHighlightBorder()
    {
        return highlightBorder;
    }
    
    /**
     * 
     * @param highlightBorder the border which will be used to highlight an invalid input
     */
    public void SetHighlightBorder(Border highlightBorder)
    {
        this.highlightBorder = highlightBorder;
    }
}
