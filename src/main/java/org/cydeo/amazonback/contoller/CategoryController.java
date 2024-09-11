package org.cydeo.amazonback.contoller;


import org.cydeo.amazonback.entity.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("category", new Category());
        return "category-create";
    }

    @PostMapping("/save")
    public String saveCategory(@ModelAttribute Category category) {
        return "redirect:/category/list";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        return "category-update";
    }

    @PostMapping("/update")
    public String updateCategory(@ModelAttribute Category category) {
        // Update the category in the database
        return "redirect:/category/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteCategory(@PathVariable("id") Long id) {
        // Delete the category from the database
        return "redirect:/category/list";
    }

    @GetMapping("/list")
    public String listCategories(Model model) {
        return "category-list";
    }
}
