package org.example;

import org.example.categories.Categories;
import org.example.product.Product;
import org.example.ui.Controller;
import org.example.user.User;
import org.example.user.UserType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.start();

    }
}