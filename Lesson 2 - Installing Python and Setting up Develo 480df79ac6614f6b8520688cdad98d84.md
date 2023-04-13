# Lesson 2 - Installing Python and Setting up Development Environment with Visual Studio Code

**Lesson 2 - Installing Python and Setting up Development Environment with Visual Studio Code**

1. **Introduction to Python Programming Language**

Python is a high-level programming language used for various purposes. Python is used in web development, machine learning applications, etc. [Guido van Rossum](https://en.wikipedia.org/wiki/Guido_van_Rossum), a programmer, introduced Python in 1991, and it is developed by the [Python Software Foundation](https://www.python.org/psf/).

Python is designed with the advantage of being easy to read, learn, and remember. The structure of Python allows for writing programs with shorter code. Python is a very bright language, with a clear structure, very suitable for beginners in programming.

Python is one of the most popular programming languages today.

most-popular-programming-language.jpeg

***Most Popular Programming Languages (01/2019 - Source: [statista.com](http://statista.com/))***

1. **Installing Python on Windows 10**

The versions of Python have two main branches: Python 2 and Python 3. They are quite different. Python 2 was released in 2000 and developed up to version 2.7.18 before being discontinued. Python 3 was released in 2008 and is not entirely compatible with Python 2. Python 3 is still being developed and currently (29/01/2022), Python 3.10.2 is available.

In the series of tutorials on [Python Programming Language](https://gochocit.com/series/ngon-ngu-lap-trinh-python), we will use Python version 3.10.2 on Windows 10. You can download it from the official Python website with the link below.

[Download Python for Windows](https://www.python.org/downloads/)

Double click on the Python installation file to start the installation.

add-python-to-path.PNG

The installation interface has the following options:

**(1) Install with default path and settings**

**(2) Customize installation path and settings**

custom-folder-install-python.PNG

**(3) It is recommended to configure the Python environment in Windows**

After a successful installation, you will see the Python installation folder.

folder-installed-python.PNG

You can go to **Start** on Windows 10 to see the Python programs that have been installed.

installed-python-programs.png

The program **IDLE (Python 3.10 64 bit)** is a simple integrated development environment for Python. **IDLE** is packaged with the Python installation program from version **Python 1.5.2b1**.

The program **Python 3.10 (64 bit)** is a Python interpreter. All Python language source code must be interpreted by the Python interpreter to run.

To check the version of Python installed, you can use the **python** command on the Windows 10 Command Prompt.

check-version-python-windows.PNG

1. **Installing Visual Studio Code**

**Visual Studio Code** is a source code editor developed by Microsoft. It is very lightweight, supports many programming languages, and has interesting features such as debugging, syntax highlighting, intelligent code completion, snippets, code refactoring, and embedded Git.

In the series of tutorials on [Python Programming Language](https://gochocit.com/series/ngon-ngu-lap-trinh-python), we will use Visual Studio Code to edit Python source code. You can download Visual Studio Code for Windows 10 from the official Visual Studio Code website with the link below.

[Download Visual Studio Code](https://code.visualstudio.com/download)

Double click on the Visual Studio Code installation file to start the installation.

install-visual-studio-code.PNG

Click Next and choose the installation path for Visual Studio Code.

custom-folder-install-visual-studio-code.PNG

After a successful installation, you will see the Visual Studio Code installation folder.

folder-installed-visual-studio-code.PNG

Below is the interface when starting "Get Started" with Visual Studio Code.

interface-visual-studio-code.png

1. **Setting up Python Development Environment with Visual Studio Code**

To program Python with Visual Studio Code, we need to install the **Python** extension for Visual Studio Code. The **Python** extension is released by Microsoft and helps automatically identify the Python interpreter, support code hints, error suggestions, debugging, code formatting, etc.

To install the **Python** extension in Visual Studio Code, you can find the **Extensions** section or press the key combination **Ctrl+Shift+X**, then type **python** and proceed to install the **Python** extension.

install-extension-python-visual-studio-code.PNG

Done, in Visual Studio Code, we find the **Explorer** section or press the key combination **Ctrl+Shift+E** to open a folder where you will create Python source code files. In the example below, a **python-examples** folder in the C partition is created and contains files with the extension **.py**. These files are Python source code files.

run-file-python-visual-studio-code.PNG

**(1) Area of Python source code files**

**(2) Source code editing area of Python**

**(3) The interpreter will be automatically recognized when opening a .py file**

**(4) Click to execute Python source code**

**(5) Terminal area to display Python program results**

**What is a virtual environment in Python?**

A Python application often has libraries with different versions. In many cases, we program for multiple applications at the same time. It will be very inconvenient and cause unnecessary errors if these applications use different library versions but they collide with each other.

**For example**, application **A** uses library **abc** version **1.7**. Application **B** also uses the **abc** library but version **2.1**. Both of these libraries have the **method1()** function, but due to different versions, they will handle differently. When running applications **A** and **B**, it is easy to cause errors or make the program run incorrectly. These cases occur a lot in reality when maintaining old projects and developing new ones.

**Installing a virtual environment for Python programs**

To better manage libraries, Python allows creating separate virtual environments containing libraries for each application. To create a virtual environment for Python in Visual Studio Code, we go to the **Terminal** section, type the command **python -m venv .venv**. Where **.venv** is the name of the virtual environment created. The name of the virtual environment is chosen by you.

create-virtual-environment-python-visual-studio-code.PNG

In the example above, we create the **.venv** virtual environment in the folder **C:\python-examples** of a Python application. Then, we use the **.venv\Scripts\activate** command to activate the virtual environment. With **.venv** being the name of the virtual environment and also the folder containing the virtual environment. While in the virtual environment, we can install libraries for this virtual environment only with the command **pip install <library_name>**. Or if you want to exit the virtual environment, use the command **deactivate**.

activate-install-library-deactivate-virtual-environment-python.PNG

In this lesson, you have learned how to install Python, Visual Studio Code, and how to set up a Python programming environment with Visual Studio Code. If you encounter any errors, please comment below, we will troubleshoot together!