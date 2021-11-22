/**
 * To display the properties of elements of the Periodic Table
 *
 * @ Kalp Shah, Medhansh Shah, Shivam Kapadia, Tanay Desai
 * @ Friday, October 8, 2021
 link for valencies: (ref.)
 https://www.schoolmykids.com/learn/interactive-periodic-table/valence-of-all-the-elements#:~:text=Valence%20Chart%20-%20Valence%20of%20all%20the%20elements,%20%202%20%2054%20more%20rows%20
 */
import java.util.Scanner;
public class Periodic_Table
{
  public static void main (String args[])
  {
    Scanner sijo_sir_is_cool = new Scanner (System.in);
      System.out.println
      ("Hello learner!\nThis program will help you know more about the 118 elements of the Modern Periodic Table\nGiven below is a brief index of elements and their atomic numbers:");
    double x; for(x=1;x<=10000;x++){} //To delay execution, so that user can read introduction
    //Code for index
      System.out.println
      ("\n1-Hydrogen\n2-Helium\n3-Lithium\n4-Beryllium\n5-Boron\n6-Carbon\n7-Nitrogen\n8-Oxygen\n9-Fluorine\n10-Neon\n11-Sodium\n12-Magnesium\n13-Aluminium\n14-Silicon\n15-Phosphorous");
      System.out.println
      ("16-Sulphur\n17-Chlorine\n18-Argon\n19-Potassium\n20-Calcium\n21-Scandium\n22-Titanium\n23-Vanadium\n24-Chromium\n25-Manganese\n26-Iron\n27-Cobalt\n28-Nickel\n29-Copper\n30-Zinc");
   for(x=1;x<=1000000000;x++){} //To delay execution, so that user can read 1 to 30
   //starting 31-60 by Shivam
      System.out.println ("31-Gallium");
      System.out.println ("32-Germanium");
      System.out.println ("33-Arsenic");
      System.out.println ("34-Selenium");
      System.out.println ("35-Bromine");
      System.out.println ("36-Krypton");
      System.out.println ("37-Rubidium");
      System.out.println ("38-Strontium");
      System.out.println ("39-Yttrium");
      System.out.println ("40-Zirconium");
      System.out.println ("41-Niobium");
      System.out.println ("42-Molybdenum");
      System.out.println ("43-Technetium");
      System.out.println ("44-Ruthenium");
      System.out.println ("45-Rhodium");
      System.out.println ("46-Palladium");
      System.out.println ("47-Silver");
      System.out.println ("48-Cadmium");
      System.out.println ("49-Indium");
      System.out.println ("50-Tin");
      System.out.println ("51-Antimony");
      System.out.println ("52-Tellurium");
      System.out.println ("53-Iodine");
      System.out.println ("54-Xenon");
      System.out.println ("55-Caesium");
      System.out.println ("56-Barium");
      System.out.println ("57-Lathanum");
      System.out.println ("58-Cerium");
      System.out.println ("59-Praseodymium");
      System.out.println ("60-Neodymium");
    for(x=1;x<=1000000000;x++){} //To delay execution, so that user can read 31 to 60
    //starting 61-90 by @mas1308
      System.out.println
      ("61-Promethium\n62-Samarium\n63-Europium\n64-Gadalinium\n65-Terbium");
      System.out.println
      ("66-Dysprasium\n67-Halmium\n68-Erbium\n69-Thulium\n70-Ytterbium");
      System.out.println
      ("71-Lutetium\n72-Hafnium\n73-Tantalum\n74-Tungsten\n75-Rhenium");
      System.out.
      println ("76-Osmium\n77-Iridium\n78-Platinum\n79-Gold\n80-Mercury");
      System.out.
      println ("81-Thallium\n82-Lead\n83-Bismuth\n84-Polonium\n85-Astatine");
      System.out.
      println ("86-Radon\n87-Francium\n88-Radium\n89-Actinium\n90-Thorium");
   for(x=1;x<=1000000000;x++){} //To delay execution, so that user can read 61 to 90
      System.out.println ("91-Protactinium");
      System.out.println ("92-Uranium");
      System.out.println ("93-Neptunium");
      System.out.println ("94-Plutonium");
      System.out.println ("95-Americium");
      System.out.println ("96-Curium");
      System.out.println ("97-Berkelium");
      System.out.println ("98-Californium");
      System.out.println ("99-Einsteinium");
      System.out.println ("100-Fermium");
      System.out.println ("101-Mendelevium");
      System.out.println ("102-Nobelium");
      System.out.println ("103-Lawrencium");
      System.out.println ("104-Rutherfordium");
      System.out.println ("105-Dubnium");
      System.out.println ("106-Seaborgium");
      System.out.println ("107-Bohrium");
      System.out.println ("108-Hassium");
      System.out.println ("109-Meitnerium");
      System.out.println ("110-Darmstadtium");
      System.out.println ("111-Roentgenium");
      System.out.println ("112-Copernicium");
      System.out.println ("113-Nihonium");
      System.out.println ("114-Flerovium");
      System.out.println ("115-Moscovium");
      System.out.println ("116-Livermorium");
      System.out.println ("117-Tennessine");
      System.out.println ("118-Oganesson");
      System.out.println
      ("To obtain additional information about any element, please enter its atomic number according to the index above. If you wish to exit, please enter \"EXIT\" in block letters.\nHappy learning!");
    String choice = "";
    while (true)
      {
    choice = sijo_sir_is_cool.next ();
    switch (choice)
      {
      case "1":
        {
          System.out.println
        ("Name of element: Hydrogen\nSymbol: H\nAtomic number: 1\nMass number: 1\nNumber of protons: 1\nNumber of electrons: 1\nNumber of Neutrons: 0\nElectronic configuration: 1\nValency: +/- 1\nPeriod: 1\nPhysical state: Gaseous");
          System.out.println
        ("\nSome interesting facts about Hydrogen:\nHydrogen is a metal as well as a non-metal!\nIt lies in Group 1 as well as Group 17 of the periodic table\nHydrogen was discovered by Henry Cavendish\nHydrogen is the lightest element\n");
          break;
        }
        case "2":
        {
          System.out.println
        ("Name of element: Helium\nSymbol: He\nAtomic number: 2\nMass number: 4\nNumber of protons: 2\nNumber of electrons: 2\nNumber of Neutrons: 2\nElectronic configuration: 2\nValency: 0\nGroup: 18\nPeriod: 1");
          System.out.println
        ("\nSome interesting facts about Helium:\nHelium has two electrons in its first shell, which is also its outermost or valence shell. This condition is called duplet and it confers chemical stability and makes helium inert or unreactive\nIt is the second most abundant element in the universe, and the second lightest element\nIt has the lowest melting point and boiling point of the elements, so it only exists as a gas\n");
          break;
        }
      case "3":
        {
          System.out.println
        ("Name of element: Lithium\nSymbol: Li\nAtomic number: 3\nMass number: 7\nNumber of protons: 3\nNumber of electrons: 3\nNumber of Neutrons: 4\nElectronic configuration: 2,1\nValency: +1\nGroup: 1\nPeriod: 2\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Lithium:\nLithium is the lightest metal; in fact, it can even float on water!\nIt is soft enough to be cut with a knife \nIt is so reactive that  is stored under oil or enclosed in an inert atmosphere to prevent reaction with air or water\n");
          break;
        }
      case "4":
        {
          System.out.println
        ("Name of element: Beryllium\nSymbol: Be\nAtomic number: 4\nMass number: 9\nNumber of protons: 4\nNumber of electrons: 4\nNumber of Neutrons: 5\nElectronic configuration: 2,2\nValency: +2\nGroup: 2\nPeriod: 2\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Beryllium:\nBeryllium was discovered in 1798 by Louis-Nicholas Vauquelin\nIt is a part of many day-to-day items, including cellular phones, MP3 players, desktop and portable computers, and your car\nIt was once known as glucinum, which means sweet, because it has a sugary taste. However, Beryllium is poisonous and should never be tasted or ingested\n");
          break;
        }
      case "5":
        {
          System.out.println
        ("Name of element: Boron\nSymbol: B\nAtomic number: 5\nMass number: 11\nNumber of protons: 5\nNumber of electrons: 5\nNumber of Neutrons: 6\nElectronic configuration: 2,3\nValency: +3\nGroup: 13\nPeriod: 2\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Boron:\nBoron is a metalloid, which means that it has some properties of both metals and non-metals\nIt has the highest melting and boiling point among the metalloids\nThe boron-10 isotope is used as a Neutron absorber in nuclear reactors and is part of the emergency shutdown systems\n");
          break;
        }
      case "6":
        {
          System.out.println
        ("Name of element: Carbon\nSymbol: C\nAtomic number: 6\nMass number: 12\nNumber of protons: 6\nNumber of electrons: 6\nNumber of Neutrons: 6\nElectronic configuration: 2,4\nValency: 4\nGroup: 14\nPeriod: 2\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Carbon:\nCarbon is important for all the known living systems, and life could not exist without it\n20% of your body consists of Carbon!\nDiamond, Graphite, Fullerene, Soot, Coal, Charcoal and Coke are all allotropes(Physical forms) of Carbon\nAn isotope of Carbon - C-12 is used to measure the relative mass of other elements\n ");
          break;
        }
      case "7":
        {
          System.out.println
        ("Name of element: Nitrogen\nSymbol: N\nAtomic number: 7\nMass number: 14\nNumber of protons: 7\nNumber of electrons: 7\nNumber of Neutrons: 7\nElectronic configuration: 2,5\nValency: -3\nGroup: 15\nPeriod: 2\nPhysical state: Gas");
          System.out.println
        ("\nSome interesting facts about Nitrogen:\nNitrogen is 78% of the air we breathe!\nAll living things contain nitrogen, mostly in amino acids, DNA, and RNA\nPlants also need Nitrogen for their growth, so they absorb it in the form of water-soluble nitrates from the soil\n ");
          break;
        }
      case "8":
        {
          System.out.println
        ("Name of element: Oxygen\nSymbol: O\nAtomic number: 8\nMass number: 16\nNumber of protons: 8\nNumber of electrons: 8\nNumber of Neutrons: 8\nElectronic configuration: 2,6\nValency: -2\nGroup: 16\nPeriod: 2\nPhysical state: Gas");
          System.out.println
        ("\nSome interesting facts about Oxygen:\nOxygen is 21% of the sir we breathe!\nIt is essential for all living things as they require it for aerobic respiration\nCombustion of any substance is its rapid reaction with Oxygen to give out heat\nLiquid and solid oxygen is pale blue\n ");
          break;
        }
      case "9":
        {
          System.out.println
        ("Name of element: Fluorine\nSymbol: F\nAtomic number: 9\nMass number: 19\nNumber of protons: 9\nNumber of electrons: 9\nNumber of Neutrons: 10\nElectronic configuration: 2,7\nValency: -1\nGroup: 17\nPeriod: 2\nPhysical state: Gas");
          System.out.println
        ("\nSome interesting facts about Fluorine:\nFlourine is the most electronegative element in the periodic table\nIt is a 'halogen' or salt-producer. In fact, it is the lighest and most reactive halogen\nFlourine helps prevent tooth decay and is thus used in toothpastes!\n ");
          break;
        }
      case "10":
        {
          System.out.println
        ("Name of element: Neon\nSymbol:Ne\nAtomic number: 10\nMass number: 20\nNumber of protons: 10\nNumber of electrons: 10\nNumber of Neutrons: 10\nElectronic configuration: 2,8\nValency: 0\nGroup: 18\nPeriod: 2\nPhysical state: Gas");
          System.out.println
        ("\nSome interesting facts about Neon:\nNeon is a noble gas. It's colourless and has no smell\nNeon is commonly used in lights that are known as neon signs\nIt was first isolated and discovered in 1898 by two British chemists, William Ramsay and Morris\n ");
          break;
        }
      case "11":
        {
          System.out.println
        ("Name of element: Sodium\nSymbol:Na\nAtomic number: 11\nMass number: 23\nNumber of protons: 11\nNumber of electrons: 11\nNumber of Neutrons: 12\nElectronic configuration: 2,8,1\nValency: +1\nGroup: 1\nPeriod: 3\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Sodium:\nThe symbol of Sodium is derived from its Latin name 'Natrium' which originates from the Greek 'Nitron' meaning Sodium Carbonate\nSodium lies in the first group of the periodic table and is thus an Alkali metal. It reacts with water to form alkali called Sodium Hydroxide(NaOH)\nSodium chloride, or common salt, is the most common form of sodium found in nature\n ");
          break;
        }
      case "12":
        {
          System.out.println
        ("Name of element: Magnesium\nSymbol:Mg\nAtomic number: 12\nMass number: 24\nNumber of protons: 12\nNumber of electrons: 12\nNumber of Neutrons: 12\nElectronic configuration: 2,8,2\nValency: +2\nGroup: 2\nPeriod: 3\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Magnesium:\nMagnesium plays many crucial roles in the body, such as supporting muscle and nerve function and energy production\nIt is a cofactor in more than 300 enzyme systems that regulate diverse biochemical reactions in the body\nMagnesium is used in products that benefit from being lightweight, such as car seats, luggage, laptops, cameras and power tools\n ");
          break;
        }
      case "13":
        {
          System.out.println
        ("Name of element: Aluminium\nSymbol:Al\nAtomic number: 13\nMass number: 27\nNumber of protons: 13\nNumber of electrons: 13\nNumber of Neutrons: 14\nElectronic configuration: 2,8,3\nValency: +3\nGroup: 13\nPeriod: 3\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Aluminium:\nAluminium is the third most abundant element in the earth's crust\nIt keeps food fresh and hence is used in foils for wrapping food\nAs it is lightweight and strong, it is used in the body of aircrafts\n ");
          break;
        }
      case "14":
        {
          System.out.println
        ("Name of element: Silicon\nSymbol:Si\nAtomic number: 14\nMass number: 28\nNumber of protons: 14\nNumber of electrons: 14\nNumber of Neutrons: 14\nElectronic configuration: 2,8,4\nValency: 4\nGroup: 14\nPeriod: 3\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Silicon:\nSilicon alloys are used to make dynamo and transformer plates, engine blocks, cylinder heads and machine tools and to deoxidise steel\nSilicon is widely used in computer chips and solar cells\nSilicon Dioxide is used to produce flat glass we see in buildings across the world\n ");
          break;
        }
      case "15":
        {
          System.out.println
        ("Name of element: Phosphorus\nSymbol:P\nAtomic number: 15\nMass number: 31\nNumber of protons: 15\nNumber of electrons: 15\nNumber of Neutrons: 16\nElectronic configuration: 2,8,5\nValency: -3\nGroup: 15\nPeriod: 3\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Phosphorus:\nAlong with calcium, phosphorus is needed to build strong healthy bones, as well as, keeping other parts of your body healthy\nPhosphorus is used in the manufacture of safety matches (red phosphorus), pyrotechnics and incendiary shells\nIt burns spontaneously in air and is also responsible for some glow-in-the-dark effects. It may be a component of a firework's fuel\n ");
          break;
        }
      case "16":
        {
          System.out.println
        ("Name of element: Sulfur\nSymbol:S\nAtomic number: 16\nMass number: 32\nNumber of protons: 16\nNumber of electrons: 16\nNumber of Neutrons: 16\nElectronic configuration: 2,8,6\nValency: -2\nGroup: 16\nPeriod: 3\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Sulfur:\nMost sulfur is used in the production of sulfuric acid\nSulfuric acid is used for manufacture of fertilizers, pigments, dyes, drugs, explosives, detergents, and inorganic salts and acids, as well as in petroleum refining and metallurgical processes\nOther applications for sulfur-based chemicals include rubber vulcanization, bleaching paper, and product making such as cement\n");
          break;
        }
      case "17":
        {
          System.out.println
        ("Name of element: Chlorine\nSymbol:Cl\nAtomic number: 17\nMass number: 35\nNumber of protons: 17\nNumber of electrons: 17\nNumber of Neutrons: 18\nElectronic configuration: 2,8,7\nValency: -1\nGroup: 17\nPeriod: 3\nPhysical state: Gas");
          System.out.println
        ("\nSome interesting facts about Chlorine:\nDue to its toxic properties, chlorine was used as a chemical weapon during World War I\nIt is commonly used as an antiseptic and is used to make drinking water safe and to treat swimming pools\nLarge amounts of chlorine are used in many industrial processes, such as in the production of paper products, plastics, dyes, textiles, medicines, antiseptics, insecticides, solvents and paints\n");
          break;
        }
      case "18":
        {
          System.out.println
        ("Name of element: Argon\nSymbol:Ar\nAtomic number: 18\nMass number: 40\nNumber of protons: 18\nNumber of electrons: 18\nNumber of Neutrons: 22\nElectronic configuration: 2,8,8\nValency: 0\nGroup: 18\nPeriod: 3\nPhysical state: Gas");
          System.out.println
        ("\nSome interesting facts about Argon:\nArgon is often used when an inert atmosphere is needed. It is used in this way for the production of titanium and other reactive elements\nIt is used in incandescent light bulbs to stop oxygen from corroding the filament\nInhalation of the inert Argon in excessive concentrations can result in dizziness, nausea, vomiting, loss of consciousness, and death\n");
          break;
        }
      case "19":
        {
          System.out.println
        ("Name of element: Potassium\nSymbol:K\nAtomic number: 19\nMass number: 39\nNumber of protons: 19\nNumber of electrons: 19\nNumber of Neutrons: 20\nElectronic configuration: 2,8,8,1\nValency: +1\nGroup: 1\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Potassium:\nPotassium helps your nerves to function, muscles to contract and keeps heartbeat regular\nIt helps move nutrients into cells and waste products out of cells\nIt imparts a lavender colour to a flame, and its vapour is green\nPotassium overdose in the body can cause hyperkalemia with symptoms like abnormal heartbeat(arrhythmia). Severe cases can result in death\n");
          break;
        }
      case "20":
        {
          System.out.println
        ("Name of element: Calcium\nSymbol:Ca\nAtomic number: 20\nMass number: 40\nNumber of protons: 20\nNumber of electrons: 20\nNumber of Neutrons: 20\nElectronic configuration: 2,8,8,2\nValency: +2\nGroup: 2\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Calcium:\nCalcium is essential for building bones and keeping them healthy; enabling our blood to clot, muscles to contract and heart to beat\nSome studies suggest that it can help in protecting against cancer, diabetes and high blood pressure\nIt is the fifth most abundant element by mass in the Earth's crust; the fifth most abundant dissolved ion in seawater; and the fifth most abundant element in the human body!\n");
          break;
             }
     case "21":
        {
          System.out.println
        ("Name of element: Scandium\nSymbol: Sc\nAtomic number: 21\nMass number: 45\nNumber of protons: 21\nNumber of electrons: 21\nNumber of Neutrons: 24\nElectronic configuration: 2,8,9,2\nValency: +3\nGroup: 3\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Scandium:\nScandium is used in aluminum-scandium alloys for aerospace industry components and for sports equipment such as bicycle frames, fishing rods, golf iron shafts and baseball bats\nScandium iodide is used in mercury vapor lamps, which are used to replicate sunlight in studios for the film and television industry\n");
          break;
        }

      case "22":
        {
          System.out.println
        ("Name of element: Titanium\nSymbol: Ti\nAtomic number: 22\nMass number: 48\nNumber of protons: 22\nNumber of electrons: 22\nNumber of Neutrons: 26\nElectronic configuration: 2,8,10,2\nValency: +4\nGroup: 4\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Titanium:\nTitanium is found in almost every living thing and it is the most biocompatible metal - not harmful or toxic to living tissues\nIt is as strong as steel but weights about half as much\nIt connects well with bone, so it has found surgical applications such as in joint replacements and tooth implants\nIt is extensively used as a pigment in house paint, artists' paint, plastics, enamels and paper\n");
          break;
        }

      case "23":
        {
          System.out.println
        ("Name of element: Vanadium\nSymbol: V\nAtomic number: 23\nMass number: 51\nNumber of protons: 23\nNumber of electrons: 23\nNumber of Neutrons: 28\nElectronic configuration: 2,8,11,2\nValency: +4,+5\nGroup: 5\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Vanadium:\nVanadium-steel alloys are used to make extremely tough tools such as axles, armor plates, car gears, springs, cutting tools, piston rods, knives, bicycle pedals and crankshafts\nVanadium alloys are also used to make nuclear reactors because of their low-neutron-absorbing properties\n");
          break;
        }

     case "24":
        {
          System.out.println
        ("Name of element: Chromium\nSymbol: Cr\nAtomic number: 24\nMass number: 52\nNumber of protons: 24\nNumber of electrons: 24\nNumber of Neutrons: 28\nElectronic configuration: 2,8,13,1\nValency: +2\nGroup: 6\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Chromium:\nChromium is used to harden steel and to manufacture stainless steel\nBecause it has a high melting point, chromium is used to make molds for bricks\nIt's the world's hardest metal based on the Mohb's Hardness Scale, with a rating of 9.0. It is harder than iron, stainless steel, tungsten and even titanium. However, it is still brittle, meaning it can break or shatter easily\n");
          break;
        }

      case "25":
        {
          System.out.println
        ("Name of element: Manganese\nSymbol: Mn\nAtomic number: 25\nMass number: 55\nNumber of protons: 25\nNumber of electrons: 25\nNumber of Neutrons: 30\nElectronic configuration: 2,8,13,2\nValency: +2,+4,+7\nGroup: 7\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Manganese:\nManganese is essential to plant growth and is involved in the assimilation of nitrates in green plants and algae\nIt is an essential element in higher animals, in which it participates in the action of many enzymes\nMost of the manganese produced is used in the form of ferromanganese and silicomanganese alloys for iron and steel manufacture\nAluminium cans contain about 1.5 percent manganese\n");
          break;
        }
        /*
           For my future reference, others can ignore:   Valency of Iron (Fe)   26      2, 3
           Valency of Cobalt            27      3, 2
           Valency of Nickel            28      2
           Valency of Copper (Cu)       29      2, 1
           Valency of Zinc              30      2
         */
        
     case "26":
        {
          System.out.println
        ("Name of element: Iron\nSymbol: Fe\nAtomic number: 26\nMass number: 56\nNumber of protons: 26\nNumber of electrons: 26\nNumber of Neutrons: 30\nElectronic configuration: 2,8,14,2\nValency: +2,+3\nGroup: 8\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Iron:\nIron is the second most abundant of all metals on Earth. Most of the Earth's outer and inner core is made up of iron\nIt is the main component of meteorites\nIron is an essential element for blood production. About 70 percent of your body's iron is found in the red blood cells of your blood called hemoglobin and in muscle cells called myoglobin. Hemoglobin is essential for transferring oxygen in your blood from the lungs to the tissues. Myoglobin, in muscle cells, accepts, stores, transports and releases oxygen\n");
          break;
        }
            
     case "27":
        {
          System.out.println
        ("Name of element: Cobalt\nSymbol: Co\nAtomic number: 27\nMass number: 59\nNumber of protons: 27\nNumber of electrons: 27\nNumber of Neutrons: 32\nElectronic configuration: 2,8,15,2\nValency: +2,+3\nGroup: 9\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Cobalt:\nCobalt is primarily used in lithium-ion batteries, and in the manufacture of magnetic, wear-resistant and high-strength alloys\nThe compounds cobalt silicate and cobalt(II) aluminate (CoAl2O4, cobalt blue) are used to give a deep blue color to glass, ceramics, inks, paints and varnishes\nIsotope Cobalt-60 is a commercially important radioisotope, used as a radioactive tracer and for the production of high-energy gamma rays\n");
          break;
        }
            
     case "28":
        {
          System.out.println
        ("Name of element: Nickel\nSymbol: Ni\nAtomic number: 28\nMass number: 59\nNumber of protons: 28\nNumber of electrons: 28\nNumber of Neutrons: 31\nElectronic configuration: 2,8,16,2 or 2,8,17,1\nValency: +1,+2\nGroup: 10\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Nickel:\nUse of nickel (as a natural meteoric nickel–iron alloy) has been traced as far back as 3500 BCE!\nNickel is one of four elements that are ferromagnetic at approximately room temperature, which means that it can form permanent magnets, or is attracted to magnets at room temperature\nmost nickel production is used for alloying elements, coatings, batteries, and some other uses, such as kitchen wares, mobile phones, medical equipment, transport, buildings, power generation and jewellery\n");
          break;
        }
            
     case "29":
        {
          System.out.println
        ("Name of element: Copper\nSymbol: Cu\nAtomic number: 29\nMass number: 64\nNumber of protons: 29\nNumber of electrons: 29\nNumber of Neutrons: 35\nElectronic configuration: 2,8,18,1\nValency: +1,+2\nGroup: 11\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Copper:\nCopper was the first metal to be worked by man, along with gold and meteoritic iron\nIt is essential to all living organisms as a trace dietary mineral. In humans, copper is found mainly in the liver, muscle, and bone\nCopper is an essential component in the motors, wiring, radiators, connectors, brakes, and bearings used in cars and trucks\n");
          break;
        }
            
     case "30":
        {
          System.out.println
        ("Name of element: Zinc\nSymbol: Zn\nAtomic number: 30\nMass number: 65\nNumber of protons: 30\nNumber of electrons: 30\nNumber of Neutrons: 35\nElectronic configuration: 2,8,18,2\nValency: +2\nGroup: 12\nPeriod: 4\nPhysical state: Solid");
          System.out.println
        ("\nSome interesting facts about Zinc:\nZinc, a nutrient found throughout your body, helps your immune system and metabolism function. Zinc is also important to wound healing and your sense of taste and smell\n Corrosion-resistant zinc plating of iron (hot-dip galvanizing) is the major application for zinc\nOther applications are in electrical batteries and die-castings, which are important in the automobile, electrical and hardware industries\n");
          break;
        }
            
        case "31":
        {
          System.out.println ("Name of element:Gallium");
          System.out.println ("Symbol:Ga");
          System.out.println ("Group:13");
          System.out.println ("Period:4");
          System.out.println ("Atomic Number:31");
          System.out.println ("Mass Number:70");
          System.out.println ("Number of Protons:31");
          System.out.println ("Number of Electrons:31");
          System.out.println ("Number of Neutrons:39");
          System.out.println ("Electronic Configuration:2,8,18,3");
          System.out.println ("Valency:+3");
          System.out.println
        ("The Mind Blowing thing about this element is that it can melt in our hands");
          break;
        }
      case "32":
        {
          System.out.println ("Name of element:Germainium");
          System.out.println ("Symbol:Ge");
          System.out.println ("Group:14");
          System.out.println ("Period:4");
          System.out.println ("Atomic Number:32");
          System.out.println ("Mass Number:73");
          System.out.println ("Number of Protons:32");
          System.out.println ("Number of Electrons:32");
          System.out.println ("Number of Neutrons:41");
          System.out.println ("Electronic Configuration:2,8,18,4");
          System.out.println ("Valency:4");
          System.out.
        println ("It was discovered in 1886 by Clemens Winkler");
          break;
        }

      case "33":
        {
          System.out.println ("Name of element:Arsenic");
          System.out.println ("Symbol:As");
          System.out.println ("Group:15");
          System.out.println ("Period:4");
          System.out.println ("Atomic Number:33");
          System.out.println ("Mass Number:75");
          System.out.println ("Number of Protons:33");
          System.out.println ("Number of Electrons:33");
          System.out.println ("Number of Neutrons:42");
          System.out.println ("Electronic Configuration:2,8,18,5");
          System.out.println ("Valency:-3");
          System.out.println
        ("Brittle Grey Arsenic is the Most Stable form of element");
          break;
        }
      case "34":
        {
          System.out.println ("Name of element:Selenium");
          System.out.println ("Symbol:Se");
          System.out.println ("Group:16");
          System.out.println ("Period:4");
          System.out.println ("Atomic Number:34");
          System.out.println ("Mass Number:79");
          System.out.println ("Number of Protons:34");
          System.out.println ("Number of Electrons:34");
          System.out.println ("Number of Neutrons:45");
          System.out.println ("Electronic Configuration:2,8,18,6");
          System.out.println ("Valency:-2");
          System.out.println
        ("Selenium plays Critical role in Metabolism and Thyroid function");
          break;
        }
      case "35":
        {
          System.out.println ("Name of element:Bromine");
          System.out.println ("Symbol:Br");
          System.out.println ("Group:17");
          System.out.println ("Period:4");
          System.out.println ("Atomic Number:35");
          System.out.println ("Mass Number:80");
          System.out.println ("Number of Protons:35");
          System.out.println ("Number of Electrons:35");
          System.out.println ("Number of Neutrons:45");
          System.out.println ("Electronic Configuration:2,8,18,7");
          System.out.println ("Valency:-1");
          System.out.println
        ("Bromine is the 64TH most abundant element on earth's crust.");
          break;
        }
      case "36":
        {
          System.out.println ("Name of element:Krypton");
          System.out.println ("Symbol:Kr");
          System.out.println ("Group:18");
          System.out.println ("Period:4");
          System.out.println ("Atomic Number:36");
          System.out.println ("Mass Number:84");
          System.out.println ("Number of Protons:36");
          System.out.println ("Number of Electrons:36");
          System.out.println ("Number of Neutrons:48");
          System.out.println ("Electronic Configuration:2,8,18,8");
          System.out.println ("Valency:0");
          System.out.println
        ("Krypton is derived from the Greek word Kryptos meaning 'the hidden one'.");
          break;
        }
      case "37":
        {
          System.out.println ("Name of element:Rubidium");
          System.out.println ("Symbol:Rb");
          System.out.println ("Group:1");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:37");
          System.out.println ("Mass Number:86");
          System.out.println ("Number of Protons:37");
          System.out.println ("Number of Electrons:37");
          System.out.println ("Number of Neutrons:49");
          System.out.println ("Electronic Configuration:2,8,18,8,1");
          System.out.println ("Valency:+1");
          System.out.println
        ("Rubidium is the Second most electropositive Element");
          break;
        }
      case "38":
        {
          System.out.println ("Name of element:Strontium");
          System.out.println ("Symbol:Sr");
          System.out.println ("Group:2");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:38");
          System.out.println ("Mass Number:88");
          System.out.println ("Number of Protons:38");
          System.out.println ("Number of Electrons:38");
          System.out.println ("Number of Neutrons:50");
          System.out.println ("Electronic Configuration:2,8,18,8,2");
          System.out.println ("Valency:+2");
          System.out.println
        ("Strontium is named after Strontian , a small town in Scotland");
          break;
        }
      case "39":
        {
          System.out.println ("Name of element:Yttrium");
          System.out.println ("Symbol:Y");
          System.out.println ("Group:3");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:39");
          System.out.println ("Mass Number:89");
          System.out.println ("Number of Protons:39");
          System.out.println ("Number of Electrons:39");
          System.out.println ("Number of Neutrons:50");
          System.out.println ("Electronic Configuration:2,8,18,9,2");
          System.out.println ("Valency:+3");
          System.out.
        println ("Yttrium is used in Layers that can cut metals");
          break;
        }
      case "40":
        {
          System.out.println ("Name of element:Zicronium");
          System.out.println ("Symbol:Zr");
          System.out.println ("Group:4");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:40");
          System.out.println ("Mass Number:91");
          System.out.println ("Number of Protons:40");
          System.out.println ("Number of Electrons:40");
          System.out.println ("Number of Neutrons:51");
          System.out.println ("Electronic Configuration:2,8,18,10,2");
          System.out.println ("Valency:4");
          System.out.println ("Zicronium is used in Pipes");
          break;
        }
      case "41":
        {
          System.out.println ("Name of element:Niobium");
          System.out.println ("Symbol:Nb");
          System.out.println ("Group:5");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:41");
          System.out.println ("Mass Number:93");
          System.out.println ("Number of Protons:41");
          System.out.println ("Number of Electrons:41");
          System.out.println ("Number of Neutrons:52");
          System.out.println ("Electronic Configuration:2,8,18,12,1");
          System.out.println ("Valency:-3");
          System.out.println ("Niobium was first known as Colobium(Cb)");
          break;
        }
      case "42":
        {
          System.out.println ("Name of element:Molybdenum");
          System.out.println ("Symbol:Mo");
          System.out.println ("Group:6");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:42");
          System.out.println ("Mass Number:96");
          System.out.println ("Number of Protons:42");
          System.out.println ("Number of Electrons:42");
          System.out.println ("Number of Neutrons:54");
          System.out.println ("Electronic Configuration:2,8,18,13,1");
          System.out.println ("Valency:-2");
          System.out.println
        ("Lack of Molybdenum can also lead to coma/icu situation at times");
          break;
        }
      case "43":
        {
          System.out.println ("Name of element:Technetium");
          System.out.println ("Symbol:Tc");
          System.out.println ("Group:7");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:43");
          System.out.println ("Mass Number:98");
          System.out.println ("Number of Protons:43");
          System.out.println ("Number of Electrons:43");
          System.out.println ("Number of Neutrons:55");
          System.out.println ("Electronic Configuration:2,8,18,13,2");
          System.out.println ("Valency:-1");
          System.out.
        println ("Technetium is the very first man-made element");
          break;
        }
      case "44":
        {
          System.out.println ("Name of element:Ruthenium");
          System.out.println ("Symbol:Ru");
          System.out.println ("Group:8");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:44");
          System.out.println ("Mass Number:101");
          System.out.println ("Number of Protons:44");
          System.out.println ("Number of Electrons:44");
          System.out.println ("Number of Neutrons:57");
          System.out.println ("Electronic Configuration:2,8,18,15,1");
          System.out.println ("Valency:+3.+4");
          System.out.println ("Ruthenium can virtually burn Forever");
          break;
        }

      case "45":
        {
          System.out.println ("Name of element:Rhodium");
          System.out.println ("Symbol:Rh");
          System.out.println ("Group:9");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:45");
          System.out.println ("Mass Number:103");
          System.out.println ("Number of Protons:45");
          System.out.println ("Number of Electrons:45");
          System.out.println ("Number of Neutrons:58");
          System.out.println ("Electronic Configuration:2,8,18,16,1");
          System.out.println ("Valency:+3");
          System.out.println
        ("It was discovered by William Wollaston in 1803");
          break;
        }
      case "46":
        {
          System.out.println ("Name of element:Palladium");
          System.out.println ("Symbol:Pd");
          System.out.println ("Group:10");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:46");
          System.out.println ("Mass Number:106");
          System.out.println ("Number of Protons:46");
          System.out.println ("Number of Electrons:46");
          System.out.println ("Number of Neutrons:60");
          System.out.println ("Electronic Configuration:2,8,18,18");
          System.out.println ("Valency:+2");
          break;
        }
      case "47":
        {
          System.out.println ("Name of element:Silver");
          System.out.println ("Symbol:Ag");
          System.out.println ("Group:11");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:47");
          System.out.println ("Mass Number:108");
          System.out.println ("Number of Protons:47");
          System.out.println ("Number of Electrons:47");
          System.out.println ("Number of Neutrons:61");
          System.out.println ("Electronic Configuration:2,8,18,18,1");
          System.out.println ("Valency:+1");
          System.out.println ("Silver is the shiniest element of all");
          break;
        }

      case "48":
        {
          System.out.println ("Name of element:Cadmium");
          System.out.println ("Symbol:Cd");
          System.out.println ("Group:12");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:48");
          System.out.println ("Mass Number:112");
          System.out.println ("Number of Protons:48");
          System.out.println ("Number of Electrons:48");
          System.out.println ("Number of Neutrons:64");
          System.out.println ("Electronic Configuration:2,8,18,18,2");
          System.out.println ("Valency:+2");
          break;
        }
      case "49":
        {
          System.out.println ("Name of element:Indium");
          System.out.println ("Symbol:In");
          System.out.println ("Group:13");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:49");
          System.out.println ("Mass Number:115");
          System.out.println ("Number of Protons:49");
          System.out.println ("Number of Electrons:49");
          System.out.println ("Number of Neutrons:66");
          System.out.println ("Electronic Configuration:2,8,18,18,3");
          System.out.println ("Valency:+3");
          break;
        }
      case "50":
        {
          System.out.println ("Name of element:Tin");
          System.out.println ("Symbol:Sn");
          System.out.println ("Group:14");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:50");
          System.out.println ("Mass Number:119");
          System.out.println ("Number of Protons:69");
          System.out.println ("Number of Electrons:69");
          System.out.println ("Number of Neutrons:119");
          System.out.println ("Electronic Configuration:2,8,18,18,4");
          System.out.println ("Valency:4");
          break;
        }
      case "51":
        {
          System.out.println ("Name of element:Antimony");
          System.out.println ("Symbol:Sb");
          System.out.println ("Group:15");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:51");
          System.out.println ("Mass Number:122");
          System.out.println ("Number of Protons:52");
          System.out.println ("Number of Electrons:52");
          System.out.println ("Number of Neutrons:71");
          System.out.println ("Electronic Configuration:2,8,18,18,5");
          System.out.println ("Valency:-3");
          break;
        }
      case "52":
        {
          System.out.println ("Name of element:Tellurium");
          System.out.println ("Symbol:Te");
          System.out.println ("Group:16");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:52");
          System.out.println ("Mass Number:128");
          System.out.println ("Number of Protons:52");
          System.out.println ("Number of Electrons:52");
          System.out.println ("Number of Neutrons:76");
          System.out.println ("Electronic Configuration:2,8,18,18,6");
          System.out.println ("Valency:-2");
          break;
        }
      case "53":
        {
          System.out.println ("Name of element:Iodine");
          System.out.println ("Symbol:I");
          System.out.println ("Group:17");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:53");
          System.out.println ("Mass Number:127");
          System.out.println ("Number of Protons:53");
          System.out.println ("Number of Electrons:53");
          System.out.println ("Number of Neutrons:74");
          System.out.println ("Electronic Configuration:2,8,18,18,7");
          System.out.println ("Valency:-1");
          break;
        }
      case "54":
        {
          System.out.println ("Name of element:Xenon");
          System.out.println ("Symbol:xe");
          System.out.println ("Group:18");
          System.out.println ("Period:5");
          System.out.println ("Atomic Number:54");
          System.out.println ("Mass Number:131");
          System.out.println ("Number of Protons:54");
          System.out.println ("Number of Electrons:54");
          System.out.println ("Number of Neutrons:77");
          System.out.println ("Electronic Configuration:2,8,18,18,8");
          System.out.println ("Valency:0");
          break;
        }
      case "55":
        {
          System.out.println ("Name of element:Caesium");
          System.out.println ("Symbol:Cs");
          System.out.println ("Group:1");
          System.out.println ("Period:6");
          System.out.println ("Atomic Number:55");
          System.out.println ("Mass Number:133");
          System.out.println ("Number of Protons:55");
          System.out.println ("Number of Electrons:55");
          System.out.println ("Number of Neutrons:78");
          System.out.println ("Electronic Configuration:2,8,18,18,8,1");
          System.out.println ("Valency:+1");
          System.out.println ("Almost all clocks use Caesium in them");
          break;
        }
      case "56":
        {
          System.out.println ("Name of element:Barium");
          System.out.println ("Symbol:Ba");
          System.out.println ("Group:2");
          System.out.println ("Period:6");
          System.out.println ("Atomic Number:56");
          System.out.println ("Mass Number:137");
          System.out.println ("Number of Protons:56");
          System.out.println ("Number of Electrons:56");
          System.out.println ("Number of Neutrons:81");
          System.out.println ("Electronic Configuration:2,8,18,18,8,2");
          System.out.println ("Valency:+2");
          break;
        }
      case "57":
        {
          System.out.println ("Name of element:Lanthanum");
          System.out.println ("Symbol:La");
          System.out.println ("Group:3");
          System.out.println ("Period:6");
          System.out.println ("Atomic Number:57");
          System.out.println ("Mass Number:139");
          System.out.println ("Number of Protons:57");
          System.out.println ("Number of Electrons:57");
          System.out.println ("Number of Neutrons:82");
          System.out.println ("Electronic Configuration:2,8,18,18,9,2");
          System.out.println ("Valency:+3");
          break;
        }
      case "58":
        {
          System.out.println ("Name of element:Cerium");
          System.out.println ("Symbol:Ce");
          System.out.println ("Group:Lanthanides");
          System.out.println ("Period:6");
          System.out.println ("Atomic Number:58");
          System.out.println ("Mass Number:140");
          System.out.println ("Number of Protons:58");
          System.out.println ("Number of Electrons:58");
          System.out.println ("Number of Neutrons:82");
          System.out.println ("Electronic Configuration:2,8,18,19,9,2");
          System.out.println ("Valency:4");
          break;
        }
      case "59":
        {
          System.out.println ("Name of element:Praseodymium");
          System.out.println ("Symbol:Pr");
          System.out.println ("Group:Lanthanides");
          System.out.println ("Period:6");
          System.out.println ("Atomic Number:59");
          System.out.println ("Mass Number:141");
          System.out.println ("Number of Protons:59");
          System.out.println ("Number of Electrons:59");
          System.out.println ("Number of Neutrons:82");
          System.out.println ("Electronic Configuration:2,8,18,21,8,2");
          System.out.println ("Valency:-3");
          break;
        }

      case "60":
        {
          System.out.println ("Name of element:Neodymium");
          System.out.println ("Symbol:Nd");
          System.out.println ("Group:Lanthanides");
          System.out.println ("Period:6");
          System.out.println ("Atomic Number:60");
          System.out.println ("Mass Number:144");
          System.out.println ("Number of Protons:60");
          System.out.println ("Number of Electrons:60");
          System.out.println ("Number of Neutrons:84");
          System.out.println ("Electronic Configuration:2,8,18,22,8,2");
          System.out.println ("Valency:2,3,4");
          break;
        }

      case "61":
        {
          System.out.println
        ("Name of element: Promethium\nSymbol: Pm\nAtomic number: 61\nMass number: 145\nNumber of protons: 61\nNumber of electrons: 61\nNumber of Neutrons: 84\nElectronic configuration: 2,8,18,23,8,2\nValency: 3\nPeriod: 6\nGroup: 8");
          System.out.println
        ("\nSome interesting facts about Promethium: \nThe name of this element was dreived from the Greek Titan Prometheus, who stole fire from Mount Olympus and brought it down to humans, thus leading to the discovery of fire, according to legend!");
          break;
        }
      case "62":
        {
          System.out.println
        ("Name of element: Samarium\nSymbol: Sm\nAtomic number: 62\nMass number: 150\nNumber of protons: 62\nNumber of electrons: 62\nNumber of Neutrons: 88\nElectronic configuration: 2,8,18,24,8,2\nValency: 3\nPeriod: 6\nGroup: 9");
          System.out.println
        ("\nSome interesting facts about Samarium: \nSamarium was discovered in 1879 by the French chemist Paul-C    mile Lecoq de Boisbaudran and named after the mineral samarskite from which it was isolated.");
          break;
        }
      case "63":
        {
          System.out.println
        ("Name of element: Europium\nSymbol: Eu\nAtomic number: 63\nMass number: 152\nNumber of protons: 63\nNumber of electrons: 63\nNumber of Neutrons: 89\nElectronic configuration: 2,8,18,25,8,2\nValency: 3\nPeriod: 6\nGroup: 10");
          System.out.println
        ("\nSome interesting facts about Europium: \nEuropium is the most reactive rare-earth element. It rapidly oxidizes in air, so that bulk oxidation of a centimeter-sized sample occurs within several days.");
          break;
        }
      case "64":
        {
          System.out.println
        ("Name of element: Gadolinium\nSymbol: Gd\nAtomic number: 64\nMass number: 157\nNumber of protons: 64\nNumber of electrons: 64\nNumber of Neutrons: 93\nElectronic configuration: 2,8,18,25,9,2\nValency: 3\nPeriod: 6\nGroup: 11");
          System.out.println
        ("\nSome interesting facts about Gadolinium: \nVarying amounts of Gadolinium deposit in tissues of the brain, cardiac muscle, kidney, other organs and the skin");
          break;
        }
      case "65":
        {
          System.out.println
        ("Name of element: Terbium\nSymbol: Tb\nAtomic number: 65\nMass number: 159\nNumber of protons: 65\nNumber of electrons: 65\nNumber of Neutrons: 94\nElectronic configuration: 2,8,18,27,8,2\nValency: 3\nPeriod: 6\nGroup: 12");
          System.out.println
        ("\nSome interesting facts about Terbium: \nYttrium and terbium, as well as erbium and ytterbium, are named after the village of Ytterby in Sweden!");
          break;
        }
      case "66":
        {
          System.out.println
        ("Name of the element: Dysprasium\nSymbol: Dy\nAtomic Number: 66\nMass number: 162\nNumber of protons: 66\nNumber of electrons: 66\nNumber of neutrons: 96\nElectronic Configuration: 2,8,18,28,8,2\nValency: 3\nPeriod: 6\nGroup: 13");
          System.out.println
        ("\nSome interesting facts about Dysprasium: \nIt is used for its high thermal neutron absorption cross-section in making control rods in nuclear reactors and for its high magnetic susceptibility in data-storage applications!");
          break;
        }
      case "67":
        {
          System.out.println
        ("Name of the element: Halmium\nSymbol: Ho\nAtomic number: 67\nMass number: 165\nNumber of protons: 67\nNumber of electrons: 67\nNumber of neutrons: 98\nElectronic Configuration: 2,8,18,29,8,2\nValency: 3\nPeriod: 6\nGroup: 14");
          System.out.println
        ("\nSome interesting facts about Halmium: \nHalmium is used in the same way as some other rare earths in certain laser and glass-colorant applications!");
        break;
        }
        case "68":
        {
            System.out.println("Name of the element: Erbium\nSymbol: Er\nAtomic Number: 68\nMass number: 167\nNumber of protons: 68\nNumber of electrons: 68\nNumber of neutrons: 99\nElectronic Configuration: 2,8,18,30,8,2\nValency: 3\nPeriod: 6\nGroup: 15");
            System.out.println("\nSome interesting facts about Erbium: \nIt has optical fluorescent properties particularly useful in certain laser applications.");
            break;
        }
        case "69":
        {
            System.out.println("Name of the element: Thulium\nSymbol: Tm\nAtomic Number: 69\nMass number: 169\nNumber of protons: 69\nNumber of electrons: 69\nNumber of neutrons: 100\nElectronic Configuration: 2,8,18,31,8,2\nValency: 3\nPeriod: 6\nGroup: 16");
            System.out.println("\nSome interesting facts about Thulium: \nDespite its high price and rarity, Thulium is used as the radiation source in portable X-ray devices, and in some solid-state lasers!");
            break;
        }
        case "70":
        {
            System.out.println("Name of the element: Ytterbium\nSymbol: Yb\nAtomic Number: 70\nMass number: 173\nNumber of protons: 70\nNumber of electrons: 70\nNumber of neutrons: 103\nElectronic Configuration: 2,8,18,32,8,2\nValency: 3\nPeriod: 6\nGroup: 17");
            System.out.println("\nSome interesting facts about Ytterbium: \nThis element is mined in China, the United States, Brazil, and India in form of the minerals monazite, euxenite, and xenotime.");
            break;
        }
        case "71":
        {
            System.out.println("Name of the element: Lutetium\nSymbol: Lu\nAtomic Number: 71\nMass Number: 175\nNumber of protons: 71\nNumber of electrons: 71\nNumber of neutrons: 104\nElectronic Configuration: 2,8,18,32,9,2\nValency: 3\nPeriod: 6\nGroup: 18");
            System.out.println("\nSome interesting facts about Lutetium: \nLutetium has the highest Brinell hardness of any lanthanide, at 890–1300 MPa!");
            break;
        }
        case "72":
        {
            System.out.println("Name of the element: Hafnium\nSymbol: Hf\nAtomic Number: 72\nMass number: 178\nNumber of protons: 72\nNumber of electrons: 72\nNumber of neutrons: 106\nElectronic Configuration: 2,8,18,32,10,2\nValency: 4\nPeriod: 6\nGroup: 4");
            System.out.println("\nSome interesting facts about Hafnium: \nHafnium's large neutron capture cross section makes it a good material for neutron absorption in control rods in nuclear power plants!");
            break;
        }
        case "73":
        {
            System.out.println("Name of the element: Tantalum\nSymbol: Ta\nAtomic Number: 73\nMass number: 181\nNumber of protons: 73\nNumber of electrons: 73\nNumber of neutrons: 108\nElectronic Configuration: 2,8,18,32,11,2\nValency: 5\nPeriod: 6\nGroup: 5");
            System.out.println("\nSome interesting facts about Tantalum: \nTantalum is actually considered a technology-critical element.");
            break;
        }
        case "74":
        {
            System.out.println("Name of the element: Tungsten\nSymbol: W\nAtomic Number: 74\nMass number: 184\nNumber of protons: 74\nNumber of electrons: 74\nNumber of neutrons: 110\nElectronic Configuration: 2,8,18,32,12,2\nValency: 6\nPeriod: 6\nGroup: 6");
            System.out.println("\nSome interesting facts about Tungsten: \nTungsten is the only metal in the third transition series that is known to occur in biomolecules, being found in a few species of bacteria and archaea.");
            break;
        }
        case "75":
        {
            System.out.println("Name of the element: Rhenium\nSymbol: Re\nAtomic Number: 75\nMass number: 186\nNumber of protons: 75\nNumber of electrons: 75\nNumber of neutrons: 111\nElectronic Configuration: 2,8,18,32,13,2\nValency: 7\nPeriod: 6\nGroup: 7");
            System.out.println("\nSome interesting facts about Rhenium: \nDiscovered in 1925, rhenium was the last stable element to be discovered. It was named after the river Rhine in Europe.");
            break;
        }
        case "76":
        {
            System.out.println("Name of the element: Osmium\nSymbol: Os\nAtomic Number: 76\nMass Number: 186\nNumber of protons: 76\nNumber of electrons: 76\nNumebr of neutrons: 110\nElectronic Configuration: 2,8,18,32,14,2\nValency: 6\nPeriod: 6\nGroup: 8");
            System.out.println("\nSome interesting facts about Osmium: \nOsmium is the densest naturally occurring element, with an experimentally measured density of 22.59 g/cm3.");
            break;
        }
        case "77":
        {
            System.out.println("Name of the element: Iridium\nSymbol: Ir\nAtomic Number: 77\nMass Number: 192\nNumber of protons: 77\nNumber of electrons: 77\nNumber of neutrons: 115\nElectronic Configuration: 2,8,18,32,15,2\nValency: 6\nPeriod: 6\nGroup: 9");
            System.out.println("\nSome interesting facts about Iridium: \nIridium is found in meteorites in much higher abundance than in the Earth's crust.");
            break;
        }
        case "78":
        {
            System.out.println("Name of the element: Platinum\nSymbol: Pt\nAtomic Number: 78\nMass Number: 195\nNumber of protons: 78\nNumber of electrons: 78\nNumber of neutrons: 117\nElectronic Configuration:     2,8,18,32,17,1\nValency: 6\nPeriod: 6\nGroup: 10");
            System.out.println("\nSome interesting facts about Platinum: \nDuring World War II, non-military use of Platinum was banned in the United States, as it was deemed a strategic metal.");
            break;
        }
        case "79":
        {
            System.out.println("Name of the element: Gold\nSymbol: Au\nAtomic Number: 79\nMass Number: 197\nNumebr of protons: 79\nNumber of electrons: 79\nNumber of neutrons: 118\nElectronic Configuration: 2,8,18,32,18,1\nValency: 5\nPeriod: 6\nGroup: 11");
            System.out.println("\nSome interesting facts about Gold: \nA relatively rare element, gold is a precious metal that has been used for coinage, jewelry, and other arts throughout recorded history! Even you probably know about it!");
            break;
        }
        case "80":
        {
            System.out.println("Name of the element: Mercury\nSymbol: Hg\nAtomic Number: 80\nMass Number: 201\nNumber of protons: 80\nNumber of electrons: 80\nNumber of neutrons: 121\nElectronic Configuration: 2,8,18,32,18,2\nValency: 2\nPeriod: 6\nGroup: 12");
            System.out.println("\nSome interesting facts about Mercury: \nMercury is used in thermometers, barometers, manometers, sphygmomanometers, float valves, mercury switches, mercury relays, fluorescent lamps and other devices.");
            break;
        }
        case "81":
        {
            System.out.println("Name of the element: Thallium\nSymbol: TI\nAtomic Number: 81\nMass Number: 204\nNumber of protons: 81\nNumber of electrons: 81\nNumber of neutrons: 123\nElectronic Configuration:     2,8,18,32,18,3\nValency: 3\nPeriod: 6\nGroup: 13");
            System.out.println("\nSome interesting facts about Thallium: \nSoluble thallium salts (many of which are nearly tasteless) are highly toxic, and they were historically used in rat poisons and insecticides.");
            break;
        }
        case "82":
        {
            System.out.println("Name of the element: Lead\nSymbol: Pb\nAtomic Number: 82\nMass Number: 207\nNumber of protons: 82\nNumber of electrons: 82\nNumber of neutrons: 125\nElectronic Configuration: 2,8,18,32,18,4\nValency: 4\nPeriod: 6\nGroup: 14");
            System.out.println("\nSome interesting facts about Lead: \nContrary to popular belief, pencil leads in wooden pencils have never been made from lead. When the pencil originated as a wrapped graphite writing tool, the particular type of graphite used was named plumbago.");
            break;
        }
        case "83":
        {
            System.out.println("Name of the element: Bismuth\nSymbol: Bi\nAtomic Number: 83\nMass Number: 209\nNumber of protons: 83\nNumebr of electrons: 83\nNumber of neutrons: 126\nElectronic Configuration: 2,8,18,32,18,5\nValency: 5\nPeriod: 6\nGroup: 15");
            System.out.println("\nSome interesting facts about Bismuth: \nAs the toxicity of lead has become more apparent in recent years, there is an increasing use of bismuth alloys (presently about a third of bismuth production) as a replacement for lead.");
            break;
        }
        case "84":
        {
            System.out.println("Name of the element: Polonium\nSymbol: Po\nAtomic Number: 84\nMass Number: 209\nNumber of protons: 84\nNumber of electrons: 84\nNumber of neutrons: 125\nElectronic Configuration: 2,8,18,32,18,6\nValency: 6\nPeriod: 6\nGroup: 16");
            System.out.println("\nSome interesting facts about Polonium: \nPolonium was discovered in July 1898 by Marie and Pierre Curie, when it was extracted from the uranium ore pitchblende and identified solely by its strong radioactivity: it was the first element to be so discovered. Polonium was named after Marie Curie's homeland of Poland.");
            break;
        }
        case "85":
        {
            System.out.println("Name of the element: Astatine\nSymbol: At\nAtomic Number: 85\nMass Number: 210\nNumber of protons: 85\nNumber of electrons: 85\nNumber of neutrons: 125\nElectronic Configuration: 2,8,18,32,18,7\nValency: 7\nPeriod: 6\ngroup: 17");
            System.out.println("\nSome interesting facts about Astatine: \nThe first synthesis of the Astatine was in 1940 by Dale R. Corson, Kenneth Ross MacKenzie, and Emilio G. Segrè at the University of California, Berkeley, who named it from the Greek astatos, meaning 'unstable'.");
            break;
        }
        case "86":
        {
            System.out.println("Name of the element: Radon\nSymbol: Rn\nAtomic Number: 86\nMass Number: 222\nNumber of protons: 86\nNumber of electrons: 86\nNumber of neutrons: 136\nElectronic Configuration: 2,8,18,32,18,8\nValency: 6\nPeriod: 6\nGroup: 18");
            System.out.println("\nSome interesting facts about Radon: \nRadon has been produced commercially for use in radiation therapy.");
            break;
        }
        case "87":
        {
            System.out.println("Name of the element: Francium\nSymbol: Fr\nAtomic Number: 87\nMass Number: 223\nNumber of protons: 87\nNumber of electrons: 87\nNumber of neutrons: 136\nElectronic Configuration: 2,8,18,32,18,8,1\nValency: 1\nPeriod: 7\nGroup: 1");
            System.out.println("\nSome interesting facts about Francium: \nFrancium was discovered by Marguerite Perey in France (from which the element takes its name) in 1939. It was the last element first discovered in nature");
            break;
        }
        case "88":
        {
            System.out.println("Name of the element: Radium\nSymbol: Ra\nAtomic Number: 88\nMass Number: 226\nNumber of protons: 88\nNumber of electrons: 88\nNumebr of neutrons: 138\nElectronic Configuration: 2,8,18,32,18,8,2\nValency: 2\nPeriod: 7\nGroup: 2");
            System.out.println("\nSome interesting facts about Radium: \nRadium was discovered by Marie Skłodowska-Curie and her husband Pierre Curie on 21 December 1898, in a uraninite sample from Jáchymov.");
            break;
        }
        case "89":
        {
            System.out.println("Name of the element: Actinium\nSymbol: Ac\nAtomic Number: 89\nMass Number: 227\nNumber of protons: 89\nNumebr of electrons: 89\nNumebr of neutrons: 138\nElectronic Configuration: 2,8,18,32,18,9,2\nValency: 3\nPeriod: 7\nGroup: 3");
            System.out.println("\nSome interesting facts about Actinium: \nActinium is currently being studied for use in cancer treatments such as targeted alpha therapies.");
            break;
        }
        case "90":
        {
            System.out.println("Name of the element: Thorium\nSymbol: Th\nAtomic Number: 90\nMass Number: 232\nNumebr of protons: 90\nNumebr of electrons: 90\nNumber of neutrons: 142\nElectronic Configuration: 2,8,18,32,18,10,2\nValency: 4\nPeriod: 7\nGroup: 5");
            System.out.println("\nSome interesting facts about Thorium: \nEnergy, some of it in the form of visible light, is emitted when thorium is exposed to a source of energy itself, such as a cathode ray, heat, or ultraviolet light.");
            break;
        }
      case "91":
        {
          System.out.println ("Name of element:Protactinium");
          System.out.println ("Symbol:Pa");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:91");
          System.out.println ("Mass Number:231");
          System.out.println ("Number of Protons:91");
          System.out.println ("Number of Electrons:91");
          System.out.println ("Number of Neutrons:140");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 20, 9, 2");
          System.out.println ("Valency:-3");
          System.out.println ("Interesting fact: Protactinium is used mainly for research purposes. Protactinium-231 combined with the thorium-230 can be used to date marine sediments.");
          break;
        }
      case "92":
        {
          System.out.println ("Name of element:Uranium");
          System.out.println ("Symbol:U");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:92");
          System.out.println ("Mass Number:238");
          System.out.println ("Number of Protons:92");
          System.out.println ("Number of Electrons:92");
          System.out.println ("Number of Neutrons:146");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 21, 9, 2");
          System.out.println ("Valency:-2");
          System.out.println ("Interesting fact: Uranium can help us work out the age of minerals.");
          break;
        }
      case "93":
        {
          System.out.println ("Name of element:Neptunium");
          System.out.println ("Symbol:Np");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:93");
          System.out.println ("Mass Number:237");
          System.out.println ("Number of Protons:93");
          System.out.println ("Number of Electrons:93");
          System.out.println ("Number of Neutrons:144");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 22, 9, 2");
          System.out.println ("Valency:-1");
          System.out.println ("Interesting fact: Neptunium has been used in detectors of high-energy neutrons.");
          break;
        }
      case "94":
        {
          System.out.println ("Name of element:Plutonium");
          System.out.println ("Symbol:Pu");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:94");
          System.out.println ("Mass Number:244");
          System.out.println ("Number of Protons:94");
          System.out.println ("Number of Electrons:94");
          System.out.println ("Number of Neutrons:150");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 24, 8, 2");
          System.out.println ("Valency:-1");
          System.out.println ("Interesting fact: Plutonium has been used to make nuclear weapons like atomic bombs.");
          break;
        }
      case "95":
        {
          System.out.println ("Name of element:Americium");
          System.out.println ("Symbol:Am");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:95");
          System.out.println ("Mass Number:243");
          System.out.println ("Number of Protons:95");
          System.out.println ("Number of Electrons:95");
          System.out.println ("Number of Neutrons:148");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 25, 8, 2");
          System.out.println ("Valency:-1");
          System.out.println ("Interesting fact: Americium is very commonly used in smoke alarms.");
          break;
        }
      case "96":
        {
          System.out.println ("Name of element:Curium");
          System.out.println ("Symbol:Cm");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:96");
          System.out.println ("Mass Number:247");
          System.out.println ("Number of Protons:96");
          System.out.println ("Number of Electrons:96");
          System.out.println ("Number of Neutrons:151");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 25, 9, 2");
          System.out.println ("Valency:-2");
          System.out.println ("Interesting fact: Curium has been used to provide power to electrical equipment in space missions.");
          break;
        }
      case "97":
        {
          System.out.println ("Name of element:Berkelium");
          System.out.println ("Symbol:Bk");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:97");
          System.out.println ("Mass Number:247");
          System.out.println ("Number of Protons:97");
          System.out.println ("Number of Electrons:97");
          System.out.println ("Number of Neutrons:150");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 27, 8, 2");
          System.out.println ("Valency:4");
          System.out.println ("Interesting fact: Berkelium has been used in the synthesis of heavier elements such as tennessine.");
          break;
        }
      case "98":
        {
          System.out.println ("Name of element:Californium");
          System.out.println ("Symbol:Cf");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:98");
          System.out.println ("Mass Number:251");
          System.out.println ("Number of Protons:98");
          System.out.println ("Number of Electrons:98");
          System.out.println ("Number of Neutrons:153");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 28, 8, 2");
          System.out.println ("Valency:-3");
          System.out.println ("Interesting fact: Californium has been used in portable metal detectors.");
          break;
        }
      case "99":
        {
          System.out.println ("Name of element:Einsteinium");
          System.out.println ("Symbol:Es");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:99");
          System.out.println ("Mass Number:252");
          System.out.println ("Number of Protons:99");
          System.out.println ("Number of Electrons:99");
          System.out.println ("Number of Neutrons:153");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 29, 8, 2");
          System.out.println ("Valency:4");
          System.out.println ("Interesting fact: Einsteinium was created by the bombardment of neutrons with plutonium atoms in a nuclear reactor.");
          break;
        }
      case "100":
        {
          System.out.println ("Name of element:Fermium");
          System.out.println ("Symbol:Fm");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:100");
          System.out.println ("Mass Number:257");
          System.out.println ("Number of Protons:100");
          System.out.println ("Number of Electrons:100");
          System.out.println ("Number of Neutrons:157");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 30, 8, 2");
          System.out.println ("Valency:4");
          System.out.println ("Interesting fact: Fermium is the heaviest metal that is formed by the bombardment of atoms of lighter elements.");
          break;
        }
      case "101":
        {
          System.out.println ("Name of element:Mendelevium");
          System.out.println ("Symbol:Md");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:101");
          System.out.println ("Mass Number:258");
          System.out.println ("Number of Protons:101");
          System.out.println ("Number of Electrons:101");
          System.out.println ("Number of Neutrons:157");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 31, 8, 2");
          System.out.println ("Valency:+3");
          System.out.println ("Interesting fact: This element was named after the scientist Dmitri Mendeleev who first created the periodic table which very accurate about most of the elements!");
          break;
        }
      case "102":
        {
          System.out.println ("Name of element:Nobelium");
          System.out.println ("Symbol:No");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:102");
          System.out.println ("Mass Number:259");
          System.out.println ("Number of Protons:102");
          System.out.println ("Number of Electrons:102");
          System.out.println ("Number of Neutrons:157");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 8, 2");
          System.out.println ("Valency:+3");
          System.out.println ("Interesting fact: Due to its scarcity, Nobelium has no known uses except for chemical research.");
          break;
        }
      case "103":
        {
          System.out.println ("Name of element:Lawrencium");
          System.out.println ("Symbol:Lr");
          System.out.println ("Group:Actinides");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:103");
          System.out.println ("Mass Number:266");
          System.out.println ("Number of Protons:103");
          System.out.println ("Number of Electrons:103");
          System.out.println ("Number of Neutrons:163");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 8, 3");
          System.out.println ("Valency:+3");
          System.out.println ("Interesting fact: Lawrencium was named after Ernest Lawrence, the inventor of cyclotron which was instrumental in the discovery of many elements");
          break;
        }
      case "104":
        {
          System.out.println ("Name of element:Rutherfordium");
          System.out.println ("Symbol:Rf");
          System.out.println ("Group:4");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:104");
          System.out.println ("Mass Number:267");
          System.out.println ("Number of Protons:104");
          System.out.println ("Number of Electrons:104");
          System.out.println ("Number of Neutrons:163");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 10, 2");
          System.out.println ("Valency:4");
          System.out.println ("Interesting fact: Rutherfordium is a radioactive metal that does not occur naturally. Relatively few atoms have ever been made.");
          break;
        }     
      case "105":
        {
          System.out.println ("Name of element:Dubnium");
          System.out.println ("Symbol:Db");
          System.out.println ("Group:5");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:105");
          System.out.println ("Mass Number:268");
          System.out.println ("Number of Protons:268");
          System.out.println ("Number of Electrons:268");
          System.out.println ("Number of Neutrons:163");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 11, 2");
          System.out.println ("Valency:-3");
          System.out.println ("Interesting fact: Dubnium is named for the town in Russia where it was first made, Dubna");
          break;
        }
      case "106":
        {
          System.out.println ("Name of element:Seaborgium");
          System.out.println ("Symbol:Sg");
          System.out.println ("Group:6");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:106");
          System.out.println ("Mass Number:269");
          System.out.println ("Number of Protons:106");
          System.out.println ("Number of Electrons:106");
          System.out.println ("Number of Neutrons:163");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 12, 2");
          System.out.println ("Valency:-2");
          System.out.println ("Interesting fact: Seaborgium is of particular interest to fusion research.");
          break;
        }
      case "107":
        {
          System.out.println ("Name of element:Bohrium");
          System.out.println ("Symbol:Bh");
          System.out.println ("Group:7");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:107");
          System.out.println ("Mass Number:270");
          System.out.println ("Number of Protons:107");
          System.out.println ("Number of Electrons:107");
          System.out.println ("Number of Neutrons:163");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 13, 2");
          System.out.println ("Valency:-1");
          System.out.println ("Interesting fact: Bohrium was named after Danish physicist Niels Bohr.");
          break;
        }
      case "108":
        {
          System.out.println ("Name of element:Hassium");
          System.out.println ("Symbol:Hs");
          System.out.println ("Group:8");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:108");
          System.out.println ("Mass Number:277");
          System.out.println ("Number of Protons:108");
          System.out.println ("Number of Electrons:108");
          System.out.println ("Number of Neutrons:169");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 14, 2");
          System.out.println ("Valency:0");
          System.out.println ("Interesting fact: Hassium is a neutral atom in one of its valencies.");
          break;
        }
      case "109":
        {
          System.out.println ("Name of element:Meitnerium");
          System.out.println ("Symbol:Mt");
          System.out.println ("Group:9");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:109");
          System.out.println ("Mass Number:278");
          System.out.println ("Number of Protons:109");
          System.out.println ("Number of Electrons:109");
          System.out.println ("Number of Neutrons:169");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 15, 2");
          System.out.println ("Valency:-2");
          System.out.println ("Interesting fact: The density of Mt metal is calculated to be 37.4 g/cm3 at room temperature. This would give the element the second-highest density of the known elements, after neighboring element hassium, which has a predicted density of 41 g/cm3.");
          break;
        }     
      case "110":
        {
          System.out.println ("Name of element:Darmstadtium");
          System.out.println ("Symbol:Ds");
          System.out.println ("Group:10");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:110");
          System.out.println ("Mass Number:281");
          System.out.println ("Number of Protons:110");
          System.out.println ("Number of Electrons:110");
          System.out.println ("Number of Neutrons:171");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 17, 1");
          System.out.println ("Valency:-2");
          System.out.println ("Interesting fact: It was discovered in Darmstadt, Germany, but there are no naturally occurring or primordial samples of the element on Earth.");
          break;
        }
      case "111":
        {
          System.out.println ("Name of element:Roentgenium");
          System.out.println ("Symbol:Rg");
          System.out.println ("Group:11");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:111");
          System.out.println ("Mass Number:282");
          System.out.println ("Number of Protons:111");
          System.out.println ("Number of Electrons:111");
          System.out.println ("Number of Neutrons:171");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 17, 2");
          System.out.println ("Valency:+3");
          System.out.println ("Interesting fact: Roentgenium metal is predicted to have a density of 28.7 g/cm3 around room temperature.");
          break;
        }
      case "112":
        {
          System.out.println ("Name of element:Copernicium");
          System.out.println ("Symbol:Cn");
          System.out.println ("Group:12");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:112");
          System.out.println ("Mass Number:282");
          System.out.println ("Number of Protons:112");
          System.out.println ("Number of Electrons:112");
          System.out.println ("Number of Neutrons:170");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 18, 2");
          System.out.println ("Valency:+2");
          System.out.println ("Interesting fact: The instability of the element makes it unsuitable for any use in everyday life.");
          break;
        }     
      case "113":
        {
          System.out.println ("Name of element:Nihonium");
          System.out.println ("Symbol:Nh");
          System.out.println ("Group:13");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:113");
          System.out.println ("Mass Number:286");
          System.out.println ("Number of Protons:113");
          System.out.println ("Number of Electrons:113");
          System.out.println ("Number of Neutrons:173");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 18, 3");
          System.out.println ("Valency:+2"); 
          System.out.println ("Interesting fact: The minuscule amount of production of the metal restricts its use to research purposes only.");
          break;
        }
      case "114":
        {
          System.out.println ("Name of element:Flerovium");
          System.out.println ("Symbol:Fl");
          System.out.println ("Group:14");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:114");
          System.out.println ("Mass Number:289");
          System.out.println ("Number of Protons:114");
          System.out.println ("Number of Electrons:114");
          System.out.println ("Number of Neutrons:175");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 18, 4");
          System.out.println ("Valency:+2"); 
          System.out.println ("Interesting fact: Flerovium is named for Russian physicist Georgy Flyorov, founder of the Joint Institute of Nuclear Research in Dubna, Russia, where the element was discovered.");
          break;
        }

      case "115":
        {
          System.out.println ("Name of element:Moscovium");
          System.out.println ("Symbol:Mc");
          System.out.println ("Group:15");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:115");
          System.out.println ("Mass Number:290");
          System.out.println ("Number of Protons:115");
          System.out.println ("Number of Electrons:115");
          System.out.println ("Number of Neutrons:175");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 18, 5");
          System.out.println ("Valency:+3");
          System.out.println ("Interesting fact: It is used to make nihonium.");
          break;
        }
      case "116":
        {
          System.out.println ("Name of element:Livermorium");
          System.out.println ("Symbol:Lv");
          System.out.println ("Group:16");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:116");
          System.out.println ("Mass Number:293");
          System.out.println ("Number of Protons:116");
          System.out.println ("Number of Electrons:116");
          System.out.println ("Number of Neutrons:177");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 18, 6");
          System.out.println ("Valency:4");
          System.out.println ("Interesting fact: Livermorium is named for the Lawrence Livermore National Laboratory in California.");
          break;
        }     
      case "117":
        {
          System.out.println ("Name of element:Tennessine");
          System.out.println ("Symbol:Ts");
          System.out.println ("Group:17");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:117");
          System.out.println ("Mass Number:294");
          System.out.println ("Number of Protons:117");
          System.out.println ("Number of Electrons:117");
          System.out.println ("Number of Neutrons:177");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 18, 7");
          System.out.println ("Valency:-1(Predicted)");
          System.out.println ("Interesting fact: At present, tennessine is only used for research. Scientists are investigating the properties of the element and using it to produce atoms of other elements through its decay scheme.");
          break;
        }
      case "118":
        {
          System.out.println ("Name of element:Oganesson");
          System.out.println ("Symbol:Og");
          System.out.println ("Group:18");
          System.out.println ("Period:7");
          System.out.println ("Atomic Number:118");
          System.out.println ("Mass Number:294");
          System.out.println ("Number of Protons:118");
          System.out.println ("Number of Electrons:118");
          System.out.println ("Number of Neutrons:176");
          System.out.println ("Electronic Configuration:2, 8, 18, 32, 32, 18, 8");
          System.out.println ("Valency:0(predicted)");
          System.out.println ("Interesting fact: The Russian team, led by Yuri Oganessian, bombarded californium-249 with calcium-48 ions to produce three atoms of oganesson.");
          break;
        }
        
            
        //Just like this add 118 cases for different elements here
      case "EXIT":
        {
          System.out.println
        ("You have chosen to exit the program\nVisit again to keep learning!");
        System.out.println("Made with GitHub.");
          System.exit (0);
        }
      }
      }
  }
}
