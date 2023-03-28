package com.techpalle;

import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args)
	{
		ProductDetails pd=new ProductDetails();
		pd.creating();
		try
		{
			pd.inserting("Easy2Go Corner ComputerDesk","$129.99",24343773,"WE-OF-0152G","Corner computer desk\r\n" + 
					"Laminate, gray finish\r\n" + 
					"30.39\"H x 47.83\"W x 47.83\"D","Corner computer desk\r\n" + 
							"Laminate, gray finish\r\n" + 
							"30.39\"H x 47.83\"W x 47.83\"D\r\n" + 
							"1-Year Warranty");
			pd.inserting("Staples Kendall Park L-Desk","$279.99",24290427,"ST52493-CC","Double pedestal desk\r\n" + 
					"Laminated Cherry finish\r\n" + 
					"One letter file sized drawers","The Staples Kendall Park double pedestal desk features a spacious workspace with optimal storage for your home or small office\r\n" + 
							"\r\n" + 
							"Double pedestal desk\r\n" + 
							"Laminated Cherry finish\r\n" + 
							"One letter file sized drawers\r\n" + 
							"Three additional drawers for additional storage\r\n" + 
							"Additional cabinet for storage of technology or supplies\r\n" + 
							"Overall Dimensions: 30\" H x 58.5\" W x 23.2\" D\r\n" + 
							"1-Year Limited Warranty\r\n" + 
							"Full assembly required\r\n" + 
							"Product Instructions\r\n" + 
							"Update your small office or home office with the Staples Kendall Park double pedestal desk. Enjoy ample storage without compromising precious space. Stay organized with 1 file sized drawer perfect for letter sized documents or use for any other storage needs, keep your other office supplies close at hand in three additional drawers. Tuck away additional electronics or office supplies in the additional cabinet space. The dark cherry laminate adds timeless style to any small office space. The back of the desk is finished allowing for unlimited options for configuration in your room of choice. Open grommet holes let you pass wires and power cords through, so you can charge devices without experiencing tangled cables on your workspace.\r\n" + 
							"\r\n");
			pd.inserting("Easy2Go Student Computer Desk","$79.99",951573,"951573-CC","Student computer desk offers storage and workspace with a small footprint\r\n" + 
					"This desk features a rich resort cherry laminate finish that complements virtually any decor\r\n" + 
					"Overall dimensions: 34.88\"H x 35.5\"W x 19.5\"D","Use this Easy 2 Go computer desk anywhere an extra work surface or more storage is needed. With a durable laminate finish, this desk offers space for a laptop or printer, two storage shelves, and a riser shelf for more supplies. A perfect addition to any office and home, this Easy 2 Go desk contains an integrated wire management system to wrangle power cords and charging cables for a professional look.\r\n" + 
							"\r\n" + 
							"Student computer desk offers storage and workspace with a small footprint\r\n" + 
							"This desk features a rich resort cherry laminate finish that complements virtually any decor\r\n" + 
							"Overall dimensions: 34.88\"H x 35.5\"W x 19.5\"D\r\n" + 
							"Sturdy metal base gives great stability\r\n" + 
							"Compact straight design fits in tight spaces and blends with traditional or contemporary office decor\r\n" + 
							"Top of the desk offers enough space to work on a tablet or laptop without feeling cramped, while two lower shelves provide space for active work folders, office supplies, binders, electronic devices, and personal items, and a raised shelf displays family photos and awards while storing other items out of sight underneath the shelf\r\n" + 
							"Assembly required\r\n" + 
							"Features integrated wire management to prevent cables from getting tangled\r\n" + 
							"1-year manufacturer limited warranty\r\n" + 
							"Easy2Go Student Computer Desk\r\n" + 
							"Make the most of limited office space with this Easy2Go student computer desk. Extra shelf space offers enough room to organize the daily workflow.\r\n" + 
							"\r\n" + 
							"Develop a small space by adding this Easy2Go student computer desk to create an intimate work space for a staff member that needs a new area. This desk features a rich, cherry laminate finish that blends well with traditional or contemporary office spaces. The top of the desk offers enough space to work on a tablet or laptop without feeling cramped.\r\n" + 
							"\r\n" + 
							"Room to Organize\r\n" + 
							"Featuring two lower shelves, this desk has space for active work folders, office supplies, binders and personal items. Your staff member can use the riser shelf to display family photos, awards or other accolades while storing other items out of sight underneath the shelf. The integrated wire-management system keeps cables from tangling or getting in your staff's way as they use the space.\r\n" + 
							"\r\n" + 
							"\r\n");
			pd.inserting("Whalen Emergent Gaming 60'' Laminate Computer Desk","$219.99",24308799,"SPUS-EGDB","Plenty of space for multitasking with this computer desk\r\n" + 
					"Comes in black and made of laminate\r\n" + 
					"Overall dimensions: 30\"H x 60\"W x 30\"D","Assemble a complete set of gaming gear on this black computer desk. The spacious tabletop offers plenty of room for multiple monitors, and the ventilated storage cabinets, accessory trays and cable management ports provide neat organization for a CPU and peripherals. The cut-away curved front design of this Whalen Emergent Gaming desk keeps gamers up close to the cyber battlefield.\r\n" + 
					"\r\n" + 
					"Plenty of space for multitasking with this computer desk\r\n" + 
					"Comes in black and made of laminate\r\n" + 
					"Overall dimensions: 30\"H x 60\"W x 30\"D\r\n" + 
					"Base is made of engineered wood for durability and strength\r\n" + 
					"Modern-style furnishing\r\n" + 
					"Two shelves hold peripherals and office supplies\r\n" + 
					"Designed with keyboard tray for adding more space to your desk space\r\n" + 
					"Features power strip, cup holder, and headphone hook.\r\n" + 
					"Assembly required\r\n" + 
					"1-year manufacturer limited warranty\r\n" + 
					"\r\n");
			pd.inserting("Techni Mobili 47\"W Computer Desk","$250.06",674053,"RTA-8211-ES18","This computer desk offers an ample work surface and plenty of storage space\r\n" + 
					"Multi-functional computer desk comes in espresso color and is made of MDF panels with a moisture laminate veneer, while stylish frames are made of scratch-resistant powder-coated steel\r\n" + 
					"Overall dimensions: 33.5\"H x 47.25\"W x 21.5\"D","Increase productivity and organization at work with this multi-function computer desk. This desk features two drawers as well as several compartments of various sizes for easy storage and organization of materials. With a durable MDF wood construction, the desktop is resistant to damage from scratches, moisture, and wear. This Techni Mobili computer desk comes in a sleek espresso color, perfect for a home or personal office.\r\n" + 
					"\r\n" + 
					"This computer desk offers an ample work surface and plenty of storage space\r\n" + 
					"Multi-functional computer desk comes in espresso color and is made of MDF panels with a moisture laminate veneer, while stylish frames are made of scratch-resistant powder-coated steel\r\n" + 
					"Overall dimensions: 33.5\"H x 47.25\"W x 21.5\"D\r\n" + 
					"Computer desk in traditional style easily match any workspace");
			pd.inserting("South Shore Metro Computer Desk","$209.99",131939,"7259076","Right-side pedestal features 2 open storage spaces divided by 1 adjustable shelf and 1 utility drawer\r\n" + 
					"Dimensions: 37 x 42 x 20 inches (HxWxD)\r\n" + 
					"Hole in the back panel of CPU space allows for easy wire management","The South Shore Metro Computer Desk offers an ideal home office solution for small spaces. The desk features a slide-out keyboard shelf, one storage drawer, space for a CPU, and desktop space for a monitor. The simple design, chocolate finish laminate, and silver handle make it a great fit for almost any décor. The desk is made in Mexico and is compliant with several eco-friendly specifications.\r\n" + 
							"\r\n" + 
							"Right-side pedestal features 2 open storage spaces divided by 1 adjustable shelf and 1 utility drawer\r\n" + 
							"Dimensions: 37 x 42 x 20 inches (HxWxD)\r\n" + 
							"Hole in the back panel of CPU space allows for easy wire management\r\n" + 
							"Made in Mexico of non-toxic materials and components and EPP-compliant laminated particle board carrying the Forest Stewardship Council (FSC) certification\r\n" + 
							"Full assembly required\r\n" + 
							"5 year limited warranty\r\n" + 
							"⚠ WARNING: This product can expose you to chemicals including formaldehyde, which is known to the State of California to cause cancer or birth defects or other reproductive harm. For more information go to www.P65Warnings.ca.gov/furniture.\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"Eco-Friendly Desk\r\n" + 
							"The South Shore Metro computer desk is manufactured in Mexico of nontoxic materials and EPP-compliant laminated particleboard with Forest Stewardship Council (FSC) certification, which means the desk is constructed from wood grown in forests that are responsibly managed.\r\n" + 
							"\r\n" + 
							"Storage and Space in a Compact Size\r\n" + 
							"The modern home office desk offers a large desktop workspace, a storage drawer for small office supplies like pens, pencils, and cords, and a CPU space for a computer. The pullout tray saves space on the desktop while accommodating input devices like a keyboard and mouse.\r\n" + 
							"\r\n" + 
							"Product Dimensions\r\n" + 
							"The desk measures 37 by 42 by 20 inches (H x W x D), and comes with a five-year limited warranty.\r\n" + 
							"\r\n" + 
							"Package Contents\r\n" + 
							"South Shore Metro Computer Desk in chocolate, assembly instructions, and owner's manual.\r\n" + 
							"\r\n");
			pd.inserting("Eureka Ergonomic 63\" Computer Gaming Desk","$219.99",24502562,"STGD018","This computer gaming desk offers plenty of space for multitasking\r\n" + 
					"Made of mixed materials and comes in black\r\n" + 
					"Dimensions: 25.98\"H x 63\"W x 27.56\"D","Eureka Ergonomic's great products start with an idea, innovation for a better gaming experience. Eureka Ergonomic has the strictest quality control in the gaming desk industry. With each design, it uses more than 10 different testing methods and over 10000 trials for every aspect of the product. This ensures that this desk can maintain a reliable weight capacity and stability. This gaming desk comes with plenty of added features to help you have a better gaming experience.\r\n" + 
							"\r\n" + 
							"This computer gaming desk offers plenty of space for multitasking\r\n" + 
							"Made of mixed materials and comes in black\r\n" + 
							"Dimensions: 25.98\"H x 63\"W x 27.56\"D\r\n" + 
							"Features a sturdy metal base and a carbon fiber texture desktop made of engineered wood\r\n" + 
							"Modern classic desk in a rectangular shape\r\n" + 
							"Assembly required\r\n" + 
							"Meets or exceeds CARB and Prop 65 standards\r\n" + 
							"I-shaped legs for a stable design\r\n" + 
							"Supports up to 500 lbs. while still being sturdy\r\n" + 
							"Comes with a cup holder, headphone hook, controller stand, game storage, and an extra-large mouse pad\r\n" + 
							"Comes with a cable management tray, cable slot, and grommets for organization\r\n" + 
							"1-year manufacturer limited warranty\r\n");
			pd.inserting("Eureka Ergonomic 55\"W Computer Desk","$139.99",24549564,"CDST008","Rectangular computer desk is a perfect solution for office or home use\r\n" + 
					"Modern classic desk is made of engineered wood in a black finish with metal legs also in black\r\n" + 
					"Dimensions: 29.5\"H x 55\"W x 23.6\"D","Eureka starts with an idea, innovation for a better gaming experience. Eureka's strict quality control uses more than 10 different testing methods and over 10000 trials for every aspect of the product, ensuring it can maintain a reliable weight capacity and stability. This desk comes with plenty of added features for your comfort.\r\n" + 
							"\r\n" + 
							"Rectangular computer desk is a perfect solution for office or home use\r\n" + 
							"Modern classic desk is made of engineered wood in a black finish with metal legs also in black\r\n" + 
							"Dimensions: 29.5\"H x 55\"W x 23.6\"D\r\n" + 
							"With adjustable leg pads, the desk keeps stable even on uneven floor\r\n" + 
							"Assembly required\r\n" + 
							"Meets or exceeds the EPA standard\r\n" + 
							"Offers a large area for your activities like writing, reading, or working on a PC and provides ample legroom and storage room\r\n" + 
							"Easy-to-access cable ports for computer power cords and cables to keep your work space clear and clutter-free\r\n" + 
							"Scratch-resistant finish protects the desk's surface from daily wear and tear\r\n" + 
							"Detailed user manual, screwdriver, and Allen wrench are provided for your convenience\r\n" + 
							"1-year manufacturer limited warranty\r\n");
			pd.inserting("Bush Furniture Somerset 72W L Shaped Desk with Hutch","$958.99",147589,"SET001HC","Bundle includes: 72W L Shaped Desk, 72W Hutch\r\n" + 
					"Laminate over Composite Wood\r\n" + 
					"Assembled Dimensions: 29\"H x 71\"W x 70 5/6\"D","The Bush Furniture Somerset 72W L Shaped Desk with Hutch combines modern features and transitional styling to create an ideal solution for the home office.\r\n" + 
							"Maximize the potential of your home office with the Bush Furniture Somerset 72W L Shaped Desk with Hutch. Create your remote work headquarters with space for a computer, phone, printer and more. A convenient pull-out shelf provides a perfect place to keep a keyboard or laptop, while a storage cabinet and box drawer offer plenty of storage for supplies. A file drawer with ball bearing slides allows for easy access to letter size documents. Wire management slots help keep cords and cables in order. The Hutch features open storage with large compartments for books or decorations, adjustable shelves to hold work-in-progress, and two lift-up frosted glass doors that provide concealed storage. This quality furniture is tested to meet ANSI/SOHO standards for safety and performance and is backed by the Bush Furniture 6 Year Manufacturer's Warranty. American made with U.S. and imported parts.\r\n" + 
							"\r\n" + 
							"Bundle includes: 72W L Shaped Desk, 72W Hutch\r\n" + 
							"Laminate over Composite Wood\r\n" + 
							"Assembled Dimensions: 29\"H x 71\"W x 70 5/6\"D\r\n" + 
							"File drawer accommodates letter-size documents while box drawer stores office supplies and utensils\r\n" + 
							"Meets ANSI/SOHO standards for safety and performance\r\n" + 
							"Vertical storage cabinet has an adjustable shelf for storing items of various sizes\r\n" + 
							"72W surface with wire management provides plenty of room for a computer, phone, printer and more\r\n" + 
							"Desk includes a pull out keyboard or laptop tray\r\n" + 
							"Transitional styling includes tapered leg accents, elegant finish and contemporary metal hardware\r\n" + 
							"Hutch has open compartments with 2 adjustable shelves and closed storage areas with glass doors\r\n" + 
							"American made with U.S. and imported parts\r\n" + 
							"Assembly Required\r\n" + 
							"Backed by the Bush Furniture 6 Year Manufacturer's Warranty\r\n");
			pd.inserting("Bush Furniture Somerset 60W L Shaped Desk","$589.50",570273,"WC81430K","60W L Shaped Desk with wire management provides plenty of room for a computer, phone, printer and more\r\n" + 
					"Laminate over Composite Wood\r\n" + 
					"Assembled Dimensions: 29 1/7\"H x 59 1/6\"W x 59 1/6\"D","Maximize the potential of your home office with the Bush Furniture Somerset 60W L Shaped Desk. Create your remote work headquarters with space for a computer, phone, printer and more on a surface that features wire management slots for keeping cords and cables in order. A convenient pull-out shelf provides a perfect place to keep a keyboard or laptop, and the Desk also includes a vertical storage cabinet with an adjustable shelf. Place pens, paper and more in the box drawer, and enjoy a file drawer gliding on smooth ball bearing slides for an easy reach to documents. Transitional styling includes a stylish finish with tapered legs and contemporary metal hardware for an alluring appearance. This quality office desk is tested to meet ANSI/SOHO standards for safety and performance and is backed by the Bush Furniture 6 Year Manufacturer's Warranty. American made with U.S. and imported parts.\r\n" + 
							"\r\n" + 
							"60W L Shaped Desk with wire management provides plenty of room for a computer, phone, printer and more\r\n" + 
							"Laminate over Composite Wood\r\n" + 
							"Assembled Dimensions: 29 1/7\"H x 59 1/6\"W x 59 1/6\"D\r\n" + 
							"File drawer glides on smooth ball bearing slides and accommodates letter-size documents\r\n" + 
							"Box drawer stores office supplies\r\n" + 
							"Meets ANSI/SOHO standards for safety and performance\r\n" + 
							"Vertical storage cabinet has an adjustable shelf for storing items of various sizes\r\n" + 
							"Finished back allows L Shaped Desk to be placed anywhere in the room\r\n" + 
							"Includes a pullout keyboard/laptop tray that can mount to either side for a custom configuration\r\n" + 
							"Accepts Somerset 60W Hutch (sold separately)\r\n" + 
							"American made with U.S. and imported parts\r\n" + 
							"Assembly Required\r\n" + 
							"Backed by the Bush Furniture 6 Year Manufacturer's Warranty\r\n");
					
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		

	}

}
