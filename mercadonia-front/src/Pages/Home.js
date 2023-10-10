import React, { useEffect, useState } from "react";

export default function Home() {
  return (
    <div className="container">
      <div className="py-4">
        <div className="card border shadow">
          <img
            className="card-img-top"
            src=".../100px180/"
            alt="Card image cap"
          />
          <div className="card-body">
            <h5 className="card-title">Card title</h5>
            <p className="card-text">
              Some quick example text to build on the card title and make up the
              bulk of the card's content.
            </p>
          </div>
        </div>
      </div>
    </div>
  );
}
