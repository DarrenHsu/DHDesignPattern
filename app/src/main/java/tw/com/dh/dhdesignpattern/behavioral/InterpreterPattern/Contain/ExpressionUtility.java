package tw.com.dh.dhdesignpattern.behavioral.InterpreterPattern.Contain;

import tw.com.dh.dhdesignpattern.behavioral.InterpreterPattern.Expression.Add;
import tw.com.dh.dhdesignpattern.behavioral.InterpreterPattern.Expression.Expression;
import tw.com.dh.dhdesignpattern.behavioral.InterpreterPattern.Expression.Product;
import tw.com.dh.dhdesignpattern.behavioral.InterpreterPattern.Expression.Substract;

public class ExpressionUtility {
    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    public static Expression getOperator(String s, Expression leftExpression, Expression rightExpression) {
        switch (s) {
            case "+":
                return new Add(leftExpression, rightExpression);
            case "-":
                return new Substract(leftExpression, rightExpression);
            case "*":
                return new Product(leftExpression, rightExpression);
        }
        return null;
    }
}
