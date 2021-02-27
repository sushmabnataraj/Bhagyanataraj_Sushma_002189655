/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import Model_Part4.City;
import Model_Part4.CityList;
import Model_Part4.Community;
import Model_Part4.Encounter;
import Model_Part4.EncounterHistory;
import Model_Part4.House;
import Model_Part4.PatientData;
import Model_Part4.Patient;
import Model_Part4.VitalSigns;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sushm
 */
public class MainClass {

    //MainFunction starts from here
    public static void main(String[] args) {
        PatientData patientData = new PatientData();
        CityList cityList = new CityList();
//        HashMap<String, ArrayList> communityHash = new HashMap<String, ArrayList>();
//        ArrayList<Integer> bps = new ArrayList<>();
        build(patientData,cityList);
    }

    // pCondition asks user to input the options 
    public static void pConditions() {
        System.out.println("\nSelect from below options: ");
        System.out.println("\t 1 - Add new record. ");
        System.out.println("\t 2 - Display all records. ");
        System.out.println("\t 3 - Check Status of Vital Signs. ");
        System.out.println("\t 4 - Check BP.");
        System.out.println("\t 5 - Exit");
    }

    // build() is called to display the user input data
    private static void build(PatientData patientData , CityList cityList) {
        Scanner scanObj = new Scanner(System.in);

        boolean exit = false;
        int choiceNum = 0;

        System.out.println("Welcome to Vital Signs Portal");

        pConditions();

        while (!exit) {
            System.out.println("\nPlease enter any one of the above options : ");
            choiceNum = scanObj.nextInt();
            scanObj.nextLine();

            switch (choiceNum) {
                case 1:
                    addVSigns(patientData,cityList);
                    pConditions();
                    break;
                case 2:
                    displayRecords(patientData);
                    pConditions();
                    break;
                case 3:
                    isThisVitalSignNormal(patientData);
                    pConditions();
                    break;
                case 4:
                    checkBPForCommunity(patientData,cityList);
                    pConditions();
                    break;
                case 5:
                    System.out.println("\nStay healthy and fit.. Thank you for visiting..");
                    exit = true;
                    break;
            }
        }

    }

    // addVsigns ask user to input the Vital Signs of patient
    public static void addVSigns(PatientData patientData , CityList cityList) {

        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter patient's Name: ");
        

        String patientName = scanObj.nextLine();

        Patient patient = patientData.getPatient(patientName);
        
        System.out.println("Please tell us which city are you from?");
        String cityName = scanObj.nextLine();
        City ct = cityList.getCity(cityName);
        
        System.out.println("Enter your community name:");
        String community = scanObj.nextLine();
        Community comm = ct.getCommunity(community);
       
        
        System.out.println("Enter your house number:");
        int houseNum = scanObj.nextInt();
        House house = comm.getHouse(houseNum);
        
        house.addPatient(patient);

        System.out.println("\nMake sure you enter 0 for new born and 1 for Infants.");
        
        System.out.println("\nMention the Age: ");
        int ageGroup = scanObj.nextInt();

        System.out.println("Enter Respiratory Rate: ");
        int respiratoryRate = scanObj.nextInt();

        System.out.println("Enter Heart Rate: ");
        int heartRate = scanObj.nextInt();

        System.out.println("Enter Blood Pressure: ");
        int sysBloodPressure = scanObj.nextInt();

        System.out.println("Enter Weight in Kgs: ");
        double weightInKgs = scanObj.nextDouble();
       
        
        VitalSigns vitalSign = new VitalSigns();
        vitalSign.setAgeGroup(ageGroup);
        vitalSign.setRespiratoryRate(respiratoryRate);
        vitalSign.setHeartRate(heartRate);
        vitalSign.setSysBloodPressure(sysBloodPressure);
        vitalSign.setWeightInKgs(weightInKgs);
        vitalSign.setIsRecent(true);

        //setting details of patient
        patient.setCity(ct);
        patient.setHouse(house);
        patient.setCommunity(comm);
        
        //house.addPatient(patient);
        
        //Creating encounter object
        Encounter enc = new Encounter();
        enc.setPatient(patient);
        enc.setVitalSigns(vitalSign);

        patient.getEncounterHistory().addEncounter(enc);

        //addNewVitalSign(ageGroup, respiratoryRate, heartRate, sysBloodPressure, weightInKgs);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
        enc.setTimeStamp(timeStamp.toString());
        System.out.println("\nYou have succesfully added the vital signs ");

    }

    //addNewVitalSign adds new to record to existing lists or to add new one to it
    public static void addNewVitalSign(int ageGroup, int respiratoryRate, int heartRate, int sysBloodPressure, double weightInKgs) {
//        for (int i = 0; i < this.vitalSignsHistory.getVitalSignsHistory().size(); i++) {
//            VitalSignsPart2 vsign = this.vitalSignsHistory.getVitalSignsHistory().get(i);
//            if (vsign.getIsIsRecent()) {
//                vsign.setIsRecent(false);
//            }
//        }

        //vitalSignPart2.setTimestamp(timeStamp.toString());
        //this.vitalSignsHistory.addVital(vitalSignPart2);
    }

    // displayrecords one praticular record asking full name
    private static void displayRecords(PatientData patientData) {
        System.out.println("\n\n\nEncounter-History: ");
        for (Patient p : patientData.getPatientData()) { 
            System.out.println("\n\nPatient Name: " + p.getName());
            System.out.println("House Number:" + p.getHouse().getHouseNum());
            System.out.println("Community Name:" + p.getCommunity().getCommunityName());
            System.out.println("City Name:" + p.getCity().getCityName());
            p.printVitalSignsHistory();
        }
    }

    // Check whether patient is normal or abnormal
    private static void isThisVitalSignNormal(PatientData patientData) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Please Enter Patient's Name: ");

        String name = scanObj.nextLine();

        System.out.println("Please enter the attribute which you want to see: ");
        System.out.println("\nRespiratoryRate");
        System.out.println("HeartRate");
        System.out.println("SysBloodPressure");
        System.out.println("WeightInKgs");

        String selectedOption = scanObj.nextLine();

        Patient pat = patientData.getPatient(name);

        boolean result = false;

        switch (selectedOption) {
            case "RespiratoryRate":
                result = pat.isThisVitalSignNormal("RespiratoryRate");
                break;

            case "HeartRate":
                result = pat.isThisVitalSignNormal("HeartRate");
                break;

            case "SysBloodPressure":
                result = pat.isThisVitalSignNormal("SysBloodPressure");
                break;

            case "WeightInKgs":
                result = pat.isThisVitalSignNormal("WeightInKgs");
                break;
        }
    }

    private static void checkBPForCommunity(PatientData patientData,CityList cityList) {
        
        int count = 0;
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Please tell us which city are you from?");
        String cityName = scanObj.nextLine();
        City ct = cityList.getCity(cityName);
        
        System.out.println("Enter your community name:");
        String community = scanObj.nextLine();
        Community comm = ct.getCommunity(community);
        
        ArrayList<House> houseList = comm.getHouseList();
        for (House houList : houseList){
            ArrayList<Patient> pList = houList.getPatientList();
            for (Patient patList : pList){
                EncounterHistory encList = patList.getEncounterHistory();
                for (Encounter enc : encList.encounterList){
                    
                   if(enc.getVitalSigns().bloodPressureNorm() == false){
                    count++;
                   }
                }
            }
        }
        
        System.out.println("\nTotal number of people having BP: " + count++);
        
    }
}
