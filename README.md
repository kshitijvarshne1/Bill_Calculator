#Write a standalone java program that accepts items details and calculate the effective cost after applying the tax rules.
##Input
1. ####Item name 2. Item type 3.Item price 4.Item quantity Input should be accepted with following command line options:
   
   >-name  --> first item name

   >-price  --> price of first item 

   >-quantity --> quantity of first item
   
   >-type --> type of first item
   ##Business Rules
   #####Item type can have 3 possible values Raw, Manufactured and Imported and tax rules for 3 types are as follows:
   >######Raw: 12.5% of the item cost
   
   >######Manufactured: 12.5% of the item cost + 2% of (item cost + 12.5% of item cost)
   
   >######Imported: 10% import duty on item cost + a surcharge (surcharge is: Rs. 5 if the final cost after applying tax & import duty is up to Rs. 100, Rs. 10 if the cost exceeds 100 and up to 200 and 5% of the final cost if it exceeds 200).
   ###Expected Behaviour And Output
   > All options other than item name can come in any order i.e. after -name you can have -price, -type option. Item type is a mandatory option.
   > 
   > The system should provide functionality to add more than one items i.e. Once the details of first item is entered it should display a message saying:
   “Do you want to enter details of any other item (y/n):”
   > 
   > Make use of java's object-oriented capabilities for implementing this business logic
   > 
   > Exception handling is expected in the program
   > 
   > Jdk8 should be used for the assignment
   Output
   > 
   > item name, item price, sales tax liability per item, final price (sales tax + item price) to the console.
   ###Evaluation Criteria (Most Imp.)
   > Code Completeness and Correctness
   > 
   > Choice of Data Structures
   > 
   > Usage of OO Principles, package/class structure, class/ function/ variable names.
   > 
   > Code should be in running condition
   > 
   > Coding best practices
   > 
   > Exception handling