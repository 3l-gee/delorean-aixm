import './pages.css'
import { Button } from "../button/button.jsx";
import { Figure } from '../util/Figure.jsx';
import MainImg from "../../images/main.jpg";

export function MainPage() {

  return (
<main className="relative z-10 max-w-6xl mx-auto px-6 py-24 space-y-16 leading-relaxed text-lg">
  {/* Hero Section */}
  <div className="p-[80px]"></div>
  <section className="space-y-8 hero-page">
    <div className="flex space-y-8">
      <div className="space-y-6 flex-2">
        <div className=''> 
          <h1 className="text-4xl font-bold tracking-tight">AIXM, Made Simple</h1>
          <h2 className="text-4xl font-bold tracking-tight">A complete toolkit for managing AIXM aeronautical data.</h2>
        </div>
        <div className="p-[40px]"></div>
        <div className="grid grid-cols-2 items-center">
          <Button
            label="Download Delorean"
            href="https://github.com/3l-gee/delorean-aixm/releases"
            className='main-page-button'
          />
          <span className="text-gray-500">
            Available on Windows, Mac, Linux
          </span>
        </div>
      </div>
      <div className="pace-y-6 flex-1">
      </div>
    </div>
  </section>

  {/* Background / Context */}
  <section className="space-y-4">
    <h2 className="text-2xl font-semibold">Why Delorean?</h2>
    <p>
      The Delorean-AIXM project offers an open-source solution for managing AIXM aeronautical information datasets. 
      Delorean-AIXM transforms your PostgreSQL database into a comprehensive aeronautical mapping database capable of handling 
      validation, visualisation, creation, modification, merging, filtering and digital NOTAM handling. Delorean-AIXM can be integrated with 
      GIS tools, web servers, feature servers, and much more.
    </p>
  </section>

  <section className="space-y-4">
    <Figure
      src={MainImg}
      alt="AIXM in QGIS with Delorean"
      caption="Figure 1 — AIXM in QGIS with Delorean"
      className="w-[90%] max-w-[90%]"
    />
  </section>


</main>

  );
}
