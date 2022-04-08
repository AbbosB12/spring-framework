Thymeleaf Review :

Template Engine :  It used to display data in the view that controller sends.

Thymeleaf : provides a good support serving a HTML5 in web application. to integrate Thymelaf with spring boot, we need
to add : spring-boot-starter-thymeleaf

            to convert HTML file to thymelaf, we need to add the attribute xmlns:th="http://www.thymeleaf.org"

Displaying values :
th:text is used to display the value of model attributes ${attribute_key} expression is used to refer to any of the
attibutes we send from controller

@Controller @RequestMapping("/car")
public class CarController{

    @RequestMapping("/info")
    public String carInfor(Model model){

      List<String> cars = Arrays.asList("Honda","Toyota","Tesla");
      model.addAttribute("cars",cars);

      return "car/car-info";

    }

}

car-info.html :

<h2 th:text = "${cars.get(0)}"></h2>

Link: @{...} expression is used to create URLs

    Absolute URLs : <a th:href="@{https://cydeo.com/}">Cydeo</a>

    Relative URLs :  <a th:href = "@{/car/buy}">Buy</a>

    Adding Parameters to Link : <a th:href = "@{/car/buy(year=2019)}"   = > ..../car/buy?year=2019

Iteration : th:each is used to achieve iteration

  <ul> 

     <li th:each = "car : ${cars}" th:text=${car}>Car</li

  </ul>

Task:

    <tr th:each="mentor : ${mentors}">
        <td th:text="${mentor.firstName}"></td>
        <td th:text="${mentor.lastName}"></td>
        <td th:text="${mentor.age}"></td>
        <td th:text="${mentor.gender}"></td>
    </tr>

Adding CSS,JS,Images : The default directory is : src/main/resources/static

    <link th:href="@{/css/main.css}" rel="stylesheet"/>

    <script type="text/javascript" th:src="@{/js/main.js}"></script

    <img th:src="@{/images/java.png}"/>

Fragments : reusable common parts in our pages

     th:replace : replaces the current tag with the tag definining the fragment

     index.html

      <div th:fragment="main-menu">
          <a href="https://cydeo.com/">Cydeo</a>
      </div>

      welcome.html

      <div th:replace="/fragments/index :: main-menu"></div>

Conditional Logic:

<div th:text="${students.get(0).age > 25 ? 'ELIGIBLE' : 'NOT ELIGIBLE'}"></div>

<div>
    <span th:if="${students.get(0).getState() == 'Arizona'}">Arizona</span>
    <span th:unless="${students.get(0).getState() == 'Arizona'}">Not Arizona</span>
</div>