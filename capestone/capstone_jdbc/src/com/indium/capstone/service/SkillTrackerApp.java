package com.indium.capstone.service;

import com.indium.capstone.Dao.AssociateDao;
import com.indium.capstone.Dao.AssociateDaoJdbcImpl;
import com.indium.capstone.Dao.SkillDao;
import com.indium.capstone.Dao.SkillDaoImpl;
import com.indium.capstone.model.Associate;
import com.indium.capstone.model.Skill;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class SkillTrackerApp implements SkillTracker{
    AssociateDao associateDao;
    SkillDao skillDao;
    private List<Associate> associates = new ArrayList<>();
    private List<Skill> skills = new ArrayList<>();

    public SkillTrackerApp() {

        associateDao = new AssociateDaoJdbcImpl();
        skillDao = new SkillDaoImpl();
    }

    public void addAssociate(Associate associate) {
        boolean createStatus = associateDao.create(associate);
//        associates.add(associate);
    }

    public void listAssociates() {
        associates = associateDao.getall();
        for (Associate associate : associates) {
            int id = associate.getId();
            System.out.println(id);
//            associate.viewDetails(id);
            associate.viewDetails();
            System.out.println();
        }
    }

    public void editAssociate(Associate updatedAssociate) {
        boolean editAssociateStatus = associateDao.update(updatedAssociate);
    }

    public void deleteAssociate(int associateId) {
        boolean deleteAssociateStatus = associateDao.delete(associateId);
    }

    public void addSkillToAssociate(int associateId, Skill skill) {
        boolean addSkillStatus = skillDao.create(skill);
//        for (Associate associate : associates) {
//            if (associate.getId() == associateId) {
//                associate.addSkill(skill);
//                break;
//            }
//        }
    }

    public void editSkill(int skillId, Skill updatedSkill) {
        boolean editSkillStatus = skillDao.update(updatedSkill);
//        for (Skill skill : skills) {
//            if (skill.getId() == skillId) {
//                skill.setName(updatedSkill.getName());
//                skill.setDescription(updatedSkill.getDescription());
//                skill.setCategory(updatedSkill.getCategory());
//                skill.setExperience(updatedSkill.getExperience());
//                break;
//            }
//        }
//        for (Associate associate : associates) {
//            associate.editSkill(skillId, updatedSkill);
//        }
    }

    public void deleteSkill(int skillId) {
        boolean deleteSkillStatus = skillDao.delete(skillId);
//        skills.removeIf(skill -> skill.getId() == skillId);
//        for (Associate associate : associates) {
//            associate.deleteSkill(skillId);
//        }
    }

    public void viewAssociate(int associateId){
        Associate associate = associateDao.get(associateId);
        associate.viewDetails();
//        for (Associate associate : associates) {
//            if (associate.getId() == associateId) {
//                associate.viewDetails();
//            }
//        }
    }

    public void searchAssociateByName(String name){
        associates = associateDao.getall();
        List<Associate> associatesByName = associates.stream()
                .filter(associate -> associate.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
        for (Associate associate : associatesByName) {
            associate.viewDetails();
        }
    }

    public void searchAssociateByLocation(String location){
        associates = associateDao.getall();
        List<Associate> associatesByLocation = associates.stream()
            .filter(associate -> associate.getLocation().equalsIgnoreCase(location))
            .collect(Collectors.toList());
        for (Associate associate : associatesByLocation) {
            associate.viewDetails();
        }
    }

    public void searchAssociateBySkills(String skillName){
        List<Associate> associatesBySkills =  associates.stream()
                .filter(associate -> associate.getSkills().stream()
                        .anyMatch(skill -> skill.getName().equalsIgnoreCase(skillName)))
                .collect(Collectors.toList());
        for (Associate associate : associatesBySkills) {
            associate.viewDetails();
        }
    }

    public void getTotalAssociates() {
        associates = associateDao.getall();
        System.out.println("the total associates are : "+associates.size());
    }

    public void getTotalAssociatesWithSkillsGreaterThan(int n) {
        int count = (int) associates.stream()
                .filter(associate -> associate.getSkills().size() > n)
                .count();
        System.out.println("total associates with grater than "+n+" skills are : "+count);
    }

    public void getAssociateIdsWithSkillsGreaterThan(int n) {
        List<Integer> associateIdsWithSkillsGreaterThan = associates.stream()
                .filter(associate -> associate.getSkills().size() > n)
                .map(Associate::getId)
                .collect(Collectors.toList());
        System.out.println("associate id's with skills graterthan "+n+" skills are");
        for (int associate : associateIdsWithSkillsGreaterThan) {
            System.out.println(associate);
        }

    }

    public void getTotalAssociatesWithSkills(String requiredSkills) {
        int totalAssociatesWithSkills =  (int) associates.stream()
                .filter(associate -> associate.getSkills().stream()
                        .anyMatch(skill -> skill.getName().equalsIgnoreCase(requiredSkills)))
                .count();
        System.out.println("total associates with given skill are : "+totalAssociatesWithSkills);
    }


}
