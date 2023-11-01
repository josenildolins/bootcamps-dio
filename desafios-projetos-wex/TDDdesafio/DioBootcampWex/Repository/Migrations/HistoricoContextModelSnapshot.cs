﻿// <auto-generated />
using System;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

#nullable disable

namespace Repository.Migrations
{
    [DbContext(typeof(HistoricoContext))]
    partial class HistoricoContextModelSnapshot : ModelSnapshot
    {
        protected override void BuildModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder.HasAnnotation("ProductVersion", "7.0.13");

            modelBuilder.Entity("Repository.Historico", b =>
                {
                    b.Property<Guid>("id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("TEXT");

                    b.Property<DateTime>("data")
                        .HasColumnType("TEXT");

                    b.Property<double>("primeiroValor")
                        .HasColumnType("REAL");

                    b.Property<double>("resultado")
                        .HasColumnType("REAL");

                    b.Property<double>("segundoValor")
                        .HasColumnType("REAL");

                    b.HasKey("id");

                    b.ToTable("Historico");
                });
#pragma warning restore 612, 618
        }
    }
}
