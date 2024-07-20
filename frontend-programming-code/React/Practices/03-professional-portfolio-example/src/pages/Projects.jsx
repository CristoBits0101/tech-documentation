import React from "react";
import "./Projects.css";
import html5 from "../assets/icons/html5.svg";
import css from "../assets/icons/css.svg";
import javascript from "../assets/icons/javascript.svg";
import laravel from "../assets/icons/laravel.svg";
import mysql from "../assets/icons/mysql.svg";
import figma from "../assets/icons/figma.svg";
import php from "../assets/icons/php.svg";

const Projects = () => {
  return (
    <>
      <article class="cookieCard">
        <p class="cookieHeading">SmartEcoSchool</p>
        <p class="cookieDescription">
          • Prototype developed for the IES El Rincón institute project.
          <br />
          • App visualizes real-time electricity and water usage with graphs.
          <br />
          • Monolithic application developed using Laravel and XAMPP.
          <br />
          • Real-time data logging, session-required access.
          <br />• Serialized via JSDelivr and chart.js with Blade templates.
        </p>
        <div>
          <a
            href="https://github.com/CristoBits0101/smart-eco-school"
            class="acceptButton"
            target="_blank"
          >
            View code
          </a>
        </div>
        <ul>
          <li>
            <img src={html5} />
          </li>
          <li>
            <img src={css} />
          </li>
          <li>
            <img src={javascript} />
          </li>
          <li>
            <img src={laravel} />
          </li>
          <li>
            <img src={mysql} />
          </li>
        </ul>
      </article>
      <article class="cookieCard">
        <p class="cookieHeading">Bear Bread App</p>
        <p class="cookieDescription">
          • Google UX Design course graduate, a major achievement.
          <br />
          • Conducted in-depth user research to refine app functionality.
          <br />
          • Designed an inclusive interface, prioritizing accessibility.
          <br />
          • Led weekly design sprints for rapid iteration.
          <br />• Developed a user-centric mobile app for the culinary domain.
        </p>
        <div>
          <a
            class="acceptButton"
            href="../../../public/bear-bread-app.pdf"
            target="_blank"
            rel="noopener noreferrer"
          >
            View design
          </a>
        </div>
        <ul>
          <li>
            <img src={figma} />
          </li>
        </ul>
      </article>
      <article class="cookieCard">
        <p class="cookieHeading">E-commerce</p>
        <p class="cookieDescription">
          • PHP repository for an e-commerce system.
          <br />
          • Includes features such as product creation, editing, and deletion.
          <br />
          • Session management with control for failed login attempts.
          <br />
          • Login and registration forms.
          <br />• Style defined in a separate CSS file.
        </p>
        <div>
          <a class="acceptButton">View code</a>
        </div>
        <ul>
          <li>
            <img src={html5} />
          </li>
          <li>
            <img src={css} />
          </li>
          <li>
            <img src={php} />
          </li>
        </ul>
      </article>
    </>
  );
};

export default Projects;
