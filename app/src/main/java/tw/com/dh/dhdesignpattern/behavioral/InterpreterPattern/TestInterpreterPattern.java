package tw.com.dh.dhdesignpattern.behavioral.InterpreterPattern;

import android.util.Log;

import java.util.Stack;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.InterpreterPattern.Contain.ExpressionUtility;
import tw.com.dh.dhdesignpattern.behavioral.InterpreterPattern.Expression.Expression;
import tw.com.dh.dhdesignpattern.behavioral.InterpreterPattern.Expression.Number;

public class TestInterpreterPattern {
    public static void test() {
        String tokenString = "7 3 - 2 1 + *";
        Stack<Expression> stack = new Stack<>();
        String[] tokenArray = tokenString.split(" ");
        for (String s : tokenArray) {
            if (ExpressionUtility.isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtility.getOperator(s, leftExpression, rightExpression);
                int result = operator.interpret();
                stack.push(new Number(result));
            }else {
                Expression i = new Number(Integer.parseInt(s));
                stack.push(i);
            }
        }
        Log.d(AppConstant.APP_TAG,"( " + tokenString + " ) : " + stack.pop().interpret());
    }
}
