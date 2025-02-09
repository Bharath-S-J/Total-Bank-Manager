# **🏦 Total Bank Manager**  

## **📌 Overview**  
**Total Bank Manager** is a **comprehensive banking management system** built using **Java (Swing)** and **MySQL**, designed for **secure and efficient banking operations**. The system operates with a **three-tier user access model**:  
- **Customers** can **register, manage their accounts, perform transactions, and raise complaints**.  
- **Employees** handle **account verification, transaction approvals, and customer support**.  
- **Managers (Super Admins)** oversee **bank operations, manage employees, track financial trends, and generate reports**.  

This project leverages **email verification, graphical analytics, automated account handling, and secure authentication** to create a **fully digital banking experience**.  

---

## **🚀 Key Features**  

### **🔐 Three-Level User Access**  
1️⃣ **Customers**  
- Register with **email verification** 📧  
- Apply for **new accounts with document upload** 📄  
- Check **application status** (approved/rejected) ✅❌  
- View **transaction history & statements** 📊  
- Perform **withdrawals (daily limit for savings accounts: ₹40,000)** 💰  
- Block/Unblock accounts 🔒  
- Raise **complaints or service requests** 🛠️  

2️⃣ **Employees**  
- **Verify, accept, or reject** customer applications 🧐  
- Handle **complaints & requests** 📩  
- Perform **transactions on behalf of customers** 💳  
- **Modify customer details & manage accounts** 📑  
- Receive **announcements from the manager** 📢  
- Use **universal search for all tables** 🔎  

3️⃣ **Managers (Super Admins)**  
- **Control & manage employees** 🏛️  
- Approve/reject **employee-submitted requests** 🔄  
- **Monitor financial statistics** using **bar & line graphs** 📈  
- Generate **reports & transaction history** 📑  
- Make **bank-wide announcements** for employees & customers 🏦  
- Track **complaint resolution & pending applications** 📊  

---

## **📊 Advanced Features**  
✔ **Automated Account Creation** – Customers get an **auto-generated account number** upon approval.  
✔ **Graphical Statistics** – View **cash flow trends, account growth, and complaints overview** in **bar & line graphs**.  
✔ **Email Verification & Notifications** – Secure **email-based registration and updates**.  
✔ **Complaint Resolution System** – Customers can **file complaints** and receive **employee support**.  
✔ **Transaction History & PDF Export** – Users can **print/download** transaction records.  

---

## **🛠️ Technologies Used**  
- **Programming Language**: Java (Swing)  
- **IDE**: Apache NetBeans  
- **Database**: MySQL  
- **Libraries & Frameworks**:  
  - 🔗 **JDBC (MySQL Connector)** – Database connectivity  
  - 📊 **JFreeChart** – Graphical statistical reports  
  - 📅 **JCalendar** – Calendar-based date selection  
  - 📩 **JavaMail API** – Email verification & notifications  
  - 📝 **iTextPDF** – PDF export for transaction records  
  - 📦 **Java Activation Framework** – Data handling support  

---

## **📦 JAR Dependencies**  
This project requires the following external libraries:  
1. `mysql-connector-java-5.1.47-bin.jar`  
2. `jfreechart-1.0.19.jar`  
3. `jcommon-1.0.23.jar`  
4. `jcalendar-1.4.jar`  
5. `javax.mail.jar`  
6. `itextpdf-5.5.9.jar`  
7. `activation-1.1.1.jar`  

---

## **⚙️ Setup Instructions**  

### **🔧 Prerequisites**  
- **Java Development Kit (JDK)**  
- **Apache NetBeans IDE**  
- **MySQL Server**  

### **🗄️ Database Setup**  
1. **Import** the provided `.sql` file to initialize the database schema.  
2. **Update** the database credentials in the project (`database.properties` or equivalent).  

### **📥 Add Required JAR Files**  
- Copy all JAR files into the `lib` folder.  
- Add them to the project **classpath** in Apache NetBeans.  

### **📌 Run the Application**  
- Open the project in **NetBeans**.  
- Modify **email configurations** for email verification.  
- Click **Run** to start the system.  

---

## **🛠️ Application Workflow**  

### **👤 Customer Workflow**  
1️⃣ **Register** → Complete **email verification** 📧  
2️⃣ **Apply for account** → Upload documents & submit 📝  
3️⃣ **Wait for approval** (Accepted/Rejected) ⏳  
4️⃣ **Upon approval**:  
   - Perform **transactions** 💳  
   - **View/download transaction history** 📄  
   - Submit **complaints/requests** 📩  
5️⃣ **Upon rejection**:  
   - View **rejection reason** ❌  
   - Resubmit **corrected application** 🔄  

### **🧑‍💼 Employee Workflow**  
1️⃣ **Review customer applications** 🕵️‍♂️  
2️⃣ **Accept/Reject with reason** ✅❌  
3️⃣ **Handle customer complaints** 📝  
4️⃣ **Manage customer account details** 🔍  
5️⃣ **Generate transaction statements** 📊  

### **👨‍💻 Manager (Super Admin) Workflow**  
1️⃣ **Manage employees** 🏛️  
2️⃣ **Approve/Reject employee-submitted requests** ✅  
3️⃣ **Monitor bank statistics** 📈  
4️⃣ **Make announcements** 📢  
5️⃣ **Track complaint resolution & pending applications** 📊  

---

## **📊 Statistical Analysis & Insights**  
✔ **Deposit vs Withdrawal** trends **(Bar & Line Graphs)**  
✔ **Total active accounts & pending applications**  
✔ **Complaint resolution progress**  
✔ **Financial inflow/outflow** tracking  

---

## **📸 Screenshots & Demo**  
*Screenshots are available in the "Images" folder.*  

---

## 📞 Contact

You can connect with me through the following platforms:

- **GitHub**: [Bharath S J](https://github.com/Bharath-S-J)  
  Explore my repositories and projects.

- **LinkedIn**: [Bharath S J](https://www.linkedin.com/in/bharath-s-j-56a734206)  
  Let's connect and discuss potential opportunities.

- **Portfolio**: [Portfolio Website](https://portfolio-bharathsj.vercel.app)  
  Check out my work and projects.


🙌 **Contributions & suggestions are welcome!** 🚀  
