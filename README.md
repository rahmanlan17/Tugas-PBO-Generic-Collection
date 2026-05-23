# Tugas PBO - Generic dan Collection Java

## Identitas Mahasiswa

- Nama : Alan Abdul Rahman
- NIM : (Isi NIM Anda)
- Mata Kuliah : Pemrograman Berorientasi Objek (PBO)
- Dosen : (Nama Dosen)

---

## Deskripsi Tugas

Tugas ini dibuat untuk memenuhi tugas mata kuliah Pemrograman Berorientasi Objek (PBO).

Materi yang diimplementasikan:

- Generic Class
- Collection Framework
  - ArrayList
  - ArrayDeque
- Class dan Object
- Encapsulation
- Inheritance
- Polymorphism
- Abstract Class
- Interface
- Package

---

## Struktur Project

```text
src
│
├── app
│   ├── ArrayListDemo.java
│   ├── ArrayDequeDemo.java
│   └── Main.java
│
├── generic
│   ├── Mahasiswa.java
│   └── Mahasiswaku.java
│
├── interfacee
│   └── Cetak.java
│
└── model
    ├── Person.java
    └── MahasiswaProject.java
```

---

## Program 1 - Generic Class

Class Generic Mahasiswa dibuat menggunakan tiga tipe data generic:

```java
Mahasiswa<String,String,Integer>
```

Output:

```text
1102020
Ferdi
21
```

---

## Program 2 - Collection Framework

### ArrayList

Digunakan untuk menyimpan daftar mahasiswa.

Output:

```text
Alan
Budi
Ferdi
```

### ArrayDeque

Digunakan untuk simulasi antrian mahasiswa.

Output:

```text
Antrian Pertama : Alan
Sisa Antrian : [Budi, Ferdi]
```

---

## Program 3 - Project PBO

Sistem Data Mahasiswa sederhana yang menerapkan:

### Class & Object

```java
MahasiswaProject
```

### Encapsulation

Menggunakan atribut private.

### Inheritance

```java
MahasiswaProject extends Person
```

### Polymorphism

Menggunakan method override.

### Abstract Class

```java
Person
```

### Interface

```java
Cetak
```

### Collection

```java
ArrayList
```

### Generic

```java
Data<T>
```

Output:

```text
Nama : Alan
NIM : 01101

Nama : Budi
NIM : 01102
```

---

## Dokumentasi

Folder Screenshot berisi:

- Struktur Project
- Generic Class
- Hasil Generic
- ArrayList
- Hasil ArrayList
- ArrayDeque
- Hasil ArrayDeque
- Project Utama
- Hasil Project

---

## Cara Menjalankan Program

1. Buka project pada VS Code atau NetBeans.
2. Compile program Java.
3. Jalankan file yang memiliki method main().
4. Lihat hasil pada terminal.

---

## Repository

Repository ini dibuat sebagai pengumpulan tugas PBO mengenai Generic dan Collection Framework Java.

Terima Kasih.
