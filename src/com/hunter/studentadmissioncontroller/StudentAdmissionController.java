package com.hunter.studentadmissioncontroller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@ModelAttribute
	public void addingCommonObjects(Model model) {
		model.addAttribute("hdrMsg", "Hunter College of Engineering, USA");
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		// webDataBinder.setDisallowedFields(new String[] { "studentMobile" });
		// SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
		// webDataBinder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(sdf2, false));
		webDataBinder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}

	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView modelAndView = new ModelAndView("AdmissionForm");

		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("AdmissionForm");
			return modelAndView;
		}

		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");

		return modelAndView;
	}
}
