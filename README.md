<div>
## Дипломная работа курса "Профессия Java-разработчик ISA" Skypro
</div>

____
### Разработчик
*Итышева Елизавета*

____
## Описание проекта и его функциональность

Сайт аналог Avito. 
Пользователи могут создавать свои объявления, а также смотреть и комментировать объявления других пользователей.

____
## Реализованы следующие функции:

* Авторизация и аутентификация пользователей;
* CRUD-операции для объявлений на сайте;
* CRUD-операции для комментариев к объявлениям;
* Пользователи могут создавать, удалять или редактировать свои объявления и комментарии. Администраторы могут удалять или редактировать все объявления и комментарии;
* Поиск объявлений по названию;
* Загрузка и отображение изображений объявлений и аватаров пользователей.

___
## Запуск приложения
* Для запуска приложения необходимо выполнить несколько шагов:
  - Клонировать проект и открыть его в среде разработки (например *IntelliJ IDEA*);
  - В файле **application.properties** указать путь к Вашей базе данных;
  - Запустить **Docker**;
  - В командной строке прописать ```docker pull ghcr.io/bizinmitya/front-react-avito:latest``` и скачать образ;
  - Запустить **Docker image** с помощью команды ```docker run -p 3000:3000 ghcr.io/bizinmitya/front-react-avito:latest```;
  - Запустить метод **main** в файле **MarketplaceApplication.java**.

После выполнения всех шагов, веб-приложение будет доступно по адресу: http://localhost:3000

Swagger будет доступен по адресу: http://localhost:8080/swagger-ui/index.html

___
## Стэк технологий
* **Backend**:
    - Java 11
    - Maven
    - Spring Boot
    - Spring Web
    - Spring Data JPA
    - Spring Security
    - Stream API
    - REST
    - GIT
    - Swagger
    - Lombok
* **SQL**:
    - PostgreSQL
    - Liquibase
* **Test**:
    - Junit
    - Mockito
* **Frontend**:
    - Docker image
