package ss9_overview_web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductDiscountCalculatorServlet", value = "/ProductDiscountCalculatorServlet")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("đã vào");
        response.sendRedirect("product_calculator.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Đã vào Post");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        float discountAmount = (float) (price * discount * 0.01);
        float discountPrice = price - discountAmount;
        System.out.println("Lượng chiết khấu: " + discountAmount );
        System.out.println("Giá sau khi chiết khấu: " + discountPrice );

        request.setAttribute("amount", discountAmount);
        request.setAttribute("price", discountPrice);
        request.getRequestDispatcher("product_price.jsp").forward(request, response);
    }
}
