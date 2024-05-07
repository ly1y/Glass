package com.bespalaya.glass.web.contracts;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ApiRouter {

    public static class OrderRouter {
        public final static String BASE_URL = "api/v1/order";
    }

    public static class CategoryRouter {
        public final static String BASE_URL = "api/v1/category";
    }

    public static class ClientRouter {
        public final static String BASE_URL = "api/v1/client";
    }

    public static class ProductRouter {
        public final static String BASE_URL = "api/v1/product";
    }

}
