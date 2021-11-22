package compilatorsolid;

class CompilerCreator {

    /**
     * Метод, который создает компилятор.
     *
     * @param LauguageName
     */
    public Compiler createCompiler(String LauguageName) {

        switch (LauguageName) {
            case "Java":
                return new JavaCompiler();
            case "C":
                return new CCompiler();
            case "Python":
                return new PythonCompiler();
        }
        return null;
    }
}

class File {

    /**
     * Метод, который задает путь к файлу
     *
     * @param file
     */
    public void FileEntry(String file, Compiler objCompiler) {
        objCompiler.setFile(file);
    }
}

class CompileStarter {

    /**
     * Метод, который запускает компилятор.
     *
     * @param objCompiler
     */
    public void Compile(Compiler objCompiler) {
        objCompiler.StartCompilation();
    }
}
